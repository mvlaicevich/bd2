package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadSesion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActividadSesionRepository extends CrudRepository<ActividadSesion, String> {

    List<ActividadSesion> findAllBySesionId(String id);
}
