package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadSesion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActividadSesionRepository extends MongoRepository<ActividadSesion, String> {

    List<ActividadSesion> findAllBySesionId(String id);
}
