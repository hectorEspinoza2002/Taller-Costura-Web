package com.dbprojecttaller.tallercostura.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "estado_pedido")
@Entity
@Data
public class EstadoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_estado")
    private Integer id;

    @Column(name = "nombre_estado")
    private String nombre;

    @Column(name = "creado_en")
    private LocalDate fechaCreacion;

}
