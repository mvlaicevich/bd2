package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.ActividadSesion;

import java.util.List;

public interface ActividadSesionService {

    List<ActividadSesion> getActividadSesionBySesionId(String id);

    void crearActividadSesion(ActividadSesion ActividadSesion);
}
