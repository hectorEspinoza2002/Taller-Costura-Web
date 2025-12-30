package com.dbprojecttaller.tallercostura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dbprojecttaller.tallercostura.model.entity.Rol;
import com.dbprojecttaller.tallercostura.model.repository.RolRepository;

@Service
public class RolService {

    private final RolRepository rolRepo;

    public RolService(RolRepository rRepo){
        this.rolRepo = rRepo;
    }

    public List<Rol> findAll(){
        return rolRepo.findAll();
    }

    public Optional<Rol> findById(Integer id){
        return rolRepo.findById(id);
    }

    public Rol guardar(Rol r){
        return rolRepo.save(r);
    }

    public void eliminar(Rol rol){
        rolRepo.delete(rol);
    }

}
