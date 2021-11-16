package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.ActividadCart;

import java.util.List;

public interface ActividadCartService {

    List<ActividadCart> getActividadCartByCartId(String id);

    void crearActividadCart(ActividadCart ActividadCart);
}
