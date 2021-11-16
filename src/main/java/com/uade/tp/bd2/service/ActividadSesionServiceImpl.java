package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.ActividadSesion;
import com.uade.tp.bd2.repository.ActividadSesionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadSesionServiceImpl implements ActividadSesionService {

    private ActividadSesionRepository ActividadSesionRepository;

    @Autowired
    public ActividadSesionServiceImpl(ActividadSesionRepository ActividadSesionRepository) {
        this.ActividadSesionRepository = ActividadSesionRepository;
    }

    @Override
    public List<ActividadSesion> getActividadSesionBySesionId(String id) {
        return ActividadSesionRepository.findAllBySesionId(id);
    }

    @Override
    public void crearActividadSesion(ActividadSesion ActividadSesion) {
        ActividadSesionRepository.save(ActividadSesion);
    }
}
