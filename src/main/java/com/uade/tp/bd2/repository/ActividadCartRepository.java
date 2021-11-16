package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadCart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ActividadCartRepository extends MongoRepository<ActividadCart, String> {

    List<ActividadCart> findAllByCartId(String id);
}