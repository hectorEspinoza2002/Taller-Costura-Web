package com.dbprojecttaller.tallercostura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dbprojecttaller.tallercostura.model.entity.TipoServicio;
import com.dbprojecttaller.tallercostura.model.repository.TipoServicioRepository;

@Service
public class TipoServicioService {

    private final TipoServicioRepository tipotSRepo;

    public TipoServicioService(TipoServicioRepository tsRepo){
        this.tipotSRepo = tsRepo;
    }

    public List<TipoServicio> findAll(){
        return tipotSRepo.findAll();
    }

    public Optional<TipoServicio> findById(Integer id){
        return tipotSRepo.findById(id);
    }

    public TipoServicio guardar(TipoServicio ts){
        return tipotSRepo.save(ts);
    }

    public void eliminar(TipoServicio tSer){
        tipotSRepo.delete(tSer);
    }

}
