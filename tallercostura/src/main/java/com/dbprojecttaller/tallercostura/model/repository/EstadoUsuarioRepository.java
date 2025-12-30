package com.dbprojecttaller.tallercostura.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbprojecttaller.tallercostura.model.entity.EstadoUsuario;

@Repository
public interface EstadoUsuarioRepository extends JpaRepository<EstadoUsuario, Integer>{

}
