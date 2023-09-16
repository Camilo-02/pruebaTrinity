package com.example.Ruta.interfaceService;

import com.example.Ruta.modelo.Agenda;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.Prueba"})
public interface IAgendaService {

    public List<Agenda>listar();
    public Optional<Agenda>listarId(int id);
    public int save (Agenda a);
    public void delete(int id);

}
