package com.example.Ruta.interfaces;

import com.example.Ruta.modelo.Agenda;
import org.springframework.data.repository.CrudRepository;

public interface IAgenda extends CrudRepository<Agenda, Integer> {
}
