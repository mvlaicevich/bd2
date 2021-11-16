package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.ActividadCart;
import com.uade.tp.bd2.repository.ActividadCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadCartServiceImpl implements ActividadCartService {

    private ActividadCartRepository actividadCartRepository;

    @Autowired
    public ActividadCartServiceImpl(ActividadCartRepository ActividadCartRepository) {
        this.actividadCartRepository = ActividadCartRepository;
    }

    @Override
    public List<ActividadCart> getActividadCartByCartId(String id) {
        return actividadCartRepository.findAllByCartId(id);
    }

    @Override
    public void crearActividadCart(ActividadCart ActividadCart) {
        actividadCartRepository.save(ActividadCart);
    }
}
