package com.example.examenejercicio2.servicio;

import com.example.examenejercicio2.modelos.Autobuses;
import com.example.examenejercicio2.modelos.Conductores;
import com.example.examenejercicio2.repositorio.IAutobusesRepo;
import com.example.examenejercicio2.repositorio.IConductoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductoresServicio implements IConductoresServicio {
    @Autowired
    private IConductoresRepo repo;

    @Override
    public List<Conductores> ObtenerTodos() {
        return repo.findAll();
    }
}
