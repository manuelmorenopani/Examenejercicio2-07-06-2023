package com.example.examenejercicio2.controlador;

import com.example.examenejercicio2.modelos.Autobuses;
import com.example.examenejercicio2.modelos.Visitas;
import com.example.examenejercicio2.servicio.AutobusServicio;
import com.example.examenejercicio2.servicio.VisitasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/autobuses")
public class AutobusesController {
    @Autowired

    private AutobusServicio ps;

    @GetMapping
    public List<Autobuses> ObtenerTodos() {
        return ps.ObtenerTodos();
    }

}
