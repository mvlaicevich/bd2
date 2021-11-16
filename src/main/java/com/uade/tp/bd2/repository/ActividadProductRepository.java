package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadProducto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ActividadProductRepository extends MongoRepository<ActividadProducto, String> {

    List<ActividadProducto> findAllByIdProducto(String id);
}