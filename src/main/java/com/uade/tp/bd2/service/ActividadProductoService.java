package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.ActividadProducto;

import java.util.List;

public interface ActividadProductoService {

    List<ActividadProducto> getActividadProductoByIdProducto(String id);

    void crearActividadProducto(ActividadProducto actividadProducto);
}
