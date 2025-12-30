package com.dbprojecttaller.tallercostura.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbprojecttaller.tallercostura.model.entity.EstadoPedido;

@Repository
public interface EstadoPedidoRepository extends JpaRepository<EstadoPedido, Integer>{

}
