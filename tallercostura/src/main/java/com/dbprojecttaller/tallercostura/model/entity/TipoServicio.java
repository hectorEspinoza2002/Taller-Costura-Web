package com.dbprojecttaller.tallercostura.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "tipo_servicio")
@Entity
@Data
public class TipoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_servicio")
    private Integer id;

    @Column(name = "nombre_servicio")
    private String nombre;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "creado_en")
    private LocalDate fechaCreacion;    

}
