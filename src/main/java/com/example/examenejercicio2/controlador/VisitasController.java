package com.example.examenejercicio2.controlador;

import com.example.examenejercicio2.modelos.Visitas;
import com.example.examenejercicio2.servicio.VisitasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/visitas")
public class VisitasController {
    @Autowired

    private VisitasServicio ps;

    @GetMapping
    public List<Visitas> ObtenerTodos() {
        return ps.ObtenerTodos();
    }

}
