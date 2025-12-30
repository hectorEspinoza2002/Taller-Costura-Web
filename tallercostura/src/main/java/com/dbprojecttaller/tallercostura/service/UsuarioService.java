package com.dbprojecttaller.tallercostura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dbprojecttaller.tallercostura.model.entity.Usuario;
import com.dbprojecttaller.tallercostura.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepo;

    public UsuarioService(UsuarioRepository uRepo){
        this.usuarioRepo = uRepo;
    }

    public List<Usuario> findAll(){
        return usuarioRepo.findAll();
    }

    public Optional<Usuario> findById(Integer id){
        return usuarioRepo.findById(id);
    }

    public Usuario guardar(Usuario u){
        return usuarioRepo.save(u);
    }

    public void eliminar(Usuario us){
        usuarioRepo.delete(us);
    }

}
