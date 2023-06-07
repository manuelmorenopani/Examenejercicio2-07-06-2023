package com.example.examenejercicio2.repositorio;

import com.example.examenejercicio2.modelos.Autobuses;
import com.example.examenejercicio2.modelos.Visitas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVisitasRepo extends JpaRepository<Visitas,Integer> {
}
