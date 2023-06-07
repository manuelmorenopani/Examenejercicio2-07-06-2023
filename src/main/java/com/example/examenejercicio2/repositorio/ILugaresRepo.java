package com.example.examenejercicio2.repositorio;

import com.example.examenejercicio2.modelos.Autobuses;
import com.example.examenejercicio2.modelos.Lugares;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugaresRepo extends JpaRepository<Lugares,Integer> {
}
