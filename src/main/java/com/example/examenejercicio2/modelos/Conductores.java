package com.example.examenejercicio2.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "conductores")
public class Conductores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dni;
    @Column(name = "nombre")
    private String nombre;


}