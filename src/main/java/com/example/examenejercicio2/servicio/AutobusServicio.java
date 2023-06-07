package com.example.examenejercicio2.servicio;

import com.example.examenejercicio2.modelos.Autobuses;
import com.example.examenejercicio2.repositorio.IAutobusesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutobusServicio implements IAutobusServicio {
    @Autowired
    private IAutobusesRepo repo;

    @Override
    public List<Autobuses> ObtenerTodos() {
        return repo.findAll();
    }
}
