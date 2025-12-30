package com.dbprojecttaller.tallercostura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dbprojecttaller.tallercostura.model.entity.MetodoPago;
import com.dbprojecttaller.tallercostura.model.repository.MetodoPagoRepository;

@Service
public class MetodoPagoService {
    
    private final MetodoPagoRepository metodopRepo;

    public MetodoPagoService(MetodoPagoRepository mpRepo){
        this.metodopRepo = mpRepo;
    }

    public List<MetodoPago> findAll(){
        return metodopRepo.findAll();
    }

    public Optional<MetodoPago> findById(Integer id){
        return metodopRepo.findById(id);
    }

    public MetodoPago guardar(MetodoPago mp){
        return metodopRepo.save(mp);
    }

    public void delete(MetodoPago mPago){
        metodopRepo.delete(mPago);
    }

}
