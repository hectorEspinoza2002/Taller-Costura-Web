package com.dbprojecttaller.tallercostura.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "metodo_pago")
@Entity
@Data
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_metodo")
    private Integer id;

    @Column(name = "nombre_metodo")
    private String nombre;

    @Column(name = "creado_en")
    private LocalDate fechaCreacion;

}
