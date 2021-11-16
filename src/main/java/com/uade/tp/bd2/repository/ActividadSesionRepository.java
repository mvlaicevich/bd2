package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadSesion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ActividadSesionRepository extends MongoRepository<ActividadSesion, String> {

    List<ActividadSesion> findAllBySesionId(String id);
}
