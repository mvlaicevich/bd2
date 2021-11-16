package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Sesion;
import com.uade.tp.bd2.model.User;
import com.uade.tp.bd2.repository.SesionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesionServiceImpl implements SesionService{

    private SesionRepository sesionRepository;

    @Autowired
    public SesionServiceImpl(SesionRepository sesionRepository) {
        this.sesionRepository = sesionRepository;
    }

    @Override
    public Sesion createSesion(User user) {
        Sesion sesion = Sesion.builder().user(user).build();
        return sesionRepository.save(sesion);
    }

    @Override
    public Sesion getSesionById(String id) {
        return sesionRepository.findById(id).get();
    }

    @Override
    public Sesion getSesionByUser(User user) {
        return sesionRepository.findByUser(user);
    }
}