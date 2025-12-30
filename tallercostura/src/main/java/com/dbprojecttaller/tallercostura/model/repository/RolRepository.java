package com.dbprojecttaller.tallercostura.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbprojecttaller.tallercostura.model.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{

}
