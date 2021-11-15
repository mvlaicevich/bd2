package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Sesion;
import com.uade.tp.bd2.model.User;

public interface SesionService {

    Sesion createSesion(User user);

    Sesion getSesionById(String id);
}
