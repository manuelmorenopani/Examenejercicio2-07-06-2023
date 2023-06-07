package com.example.examenejercicio2.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "visitas")
public class Visitas {
    @Id
    @Column(name = "id")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matricula", nullable = false)
    private Autobuses matricula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dni", nullable = false)
    private Conductores dni;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlugar", nullable = false)
    private Lugares idlugar;

    @Column(name="fechavisita")
    private String fechavisita;

}
