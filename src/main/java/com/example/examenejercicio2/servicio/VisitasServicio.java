package com.example.examenejercicio2.servicio;

import com.example.examenejercicio2.modelos.Conductores;
import com.example.examenejercicio2.modelos.Visitas;
import com.example.examenejercicio2.repositorio.IConductoresRepo;
import com.example.examenejercicio2.repositorio.IVisitasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitasServicio implements IVisitasServicio {
    @Autowired
    private IVisitasRepo repo;

    @Override
    public List<Visitas> ObtenerTodos() {
        return repo.findAll();
    }
}
