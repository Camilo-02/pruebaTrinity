package com.example.Ruta.controler;



import com.example.Ruta.interfaceService.IAgendaService;
import com.example.Ruta.modelo.Agenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controler {


    @Autowired
    private IAgendaService service;

    @GetMapping("/inicio")
    public String agregar(Model model){
        return "formulario";
    }

/*
    @GetMapping("/grabar")
    public String formulario(Model model){
        List<Agenda>agendas= service.listar();
        model.addAttribute("agendas", agendas);
        return "formulario";
    }
  */

    @GetMapping("/listar")
    public String listar(Model model){
        List<Agenda>agendas= service.listar();
        model.addAttribute("agendas", agendas);
        return "index";
    }
    @GetMapping("/formulario")
    public String agregar7(Model model){
        model.addAttribute("agenda", new Agenda());
        return "formulario";
    }
    @GetMapping("/modifica")
    public String agregar8(Model model){
        model.addAttribute("agenda", new Agenda());
        return "editador";
    }

    @PostMapping("/save")
    public String save(@Validated Agenda a){
        service.save(a);
        return "formulario";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Agenda> agenda = service.listarId(id);
        model.addAttribute("agenda", agenda);
        return "editador";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }

}

