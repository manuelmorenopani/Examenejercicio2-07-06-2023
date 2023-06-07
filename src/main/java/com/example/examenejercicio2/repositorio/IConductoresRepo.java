package com.example.examenejercicio2.repositorio;

import com.example.examenejercicio2.modelos.Autobuses;
import com.example.examenejercicio2.modelos.Conductores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConductoresRepo extends JpaRepository<Conductores,Integer> {
}