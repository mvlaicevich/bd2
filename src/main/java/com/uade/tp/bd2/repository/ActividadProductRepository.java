package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadProducto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActividadProductRepository extends MongoRepository<ActividadProducto, String> {

    List<ActividadProducto> findAllByIdProducto(String id);
}