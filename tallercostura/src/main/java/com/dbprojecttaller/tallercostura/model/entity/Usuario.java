package com.dbprojecttaller.tallercostura.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "usuario")
@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private String id;

    @Column(name = "usernmae")
    private String usuario;

    @Column(name = "password")
    private String password;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "id_rol")
    private Rol rol;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "estado_usuario")
    private Integer estado;

    @Column(name = "creado_en")
    private LocalDate fechaCreacion;

    @Column(name = "actualizado_en")
    private LocalDate fechaActualizacion;



}

