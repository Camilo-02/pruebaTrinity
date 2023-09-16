package com.example.Ruta.service;

import com.example.Ruta.interfaceService.IAgendaService;
import com.example.Ruta.interfaces.IAgenda;
import com.example.Ruta.modelo.Agenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaService implements IAgendaService {

    @Autowired
    private IAgenda data;

    @Override
    public List<Agenda> listar() {
        return (List< Agenda>) data.findAll();
    }

    @Override
    public Optional<Agenda> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Agenda a) {
        int res = 0;
        Agenda agenda = data.save(a);
        if(!agenda.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
            data.deleteById(id);
    }
}
