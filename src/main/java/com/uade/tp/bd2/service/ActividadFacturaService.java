package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.ActividadFactura;

import java.util.List;

public interface ActividadFacturaService {

    List<ActividadFactura> getActividadFacturaByFacturaId(String id);

    default void crearActividadFactura(ActividadFactura actividadFactura) {

    }
}
