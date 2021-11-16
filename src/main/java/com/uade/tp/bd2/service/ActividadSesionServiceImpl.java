package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.ActividadSesion;
import com.uade.tp.bd2.repository.ActividadSesionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadSesionServiceImpl implements ActividadSesionService {

    private ActividadSesionRepository actividadSesionRepository;

    @Autowired
    public ActividadSesionServiceImpl(ActividadSesionRepository actividadSesionRepository) {
        this.actividadSesionRepository = actividadSesionRepository;
    }

    @Override
    public List<ActividadSesion> getActividadSesionBySesionId(String id) {
        return actividadSesionRepository.findAllBySesionId(id);
    }

    @Override
    public void crearActividadSesion(ActividadSesion ActividadSesion) {
        actividadSesionRepository.save(ActividadSesion);
    }
}
