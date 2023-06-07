package com.example.examenejercicio2.servicio;

import com.example.examenejercicio2.modelos.Conductores;
import com.example.examenejercicio2.modelos.Lugares;
import com.example.examenejercicio2.repositorio.IConductoresRepo;
import com.example.examenejercicio2.repositorio.ILugaresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugaresServicio implements ILugaresServicio {
    @Autowired
    private ILugaresRepo repo;

    @Override
    public List<Lugares> ObtenerTodos() {
        return repo.findAll();
    }
}
