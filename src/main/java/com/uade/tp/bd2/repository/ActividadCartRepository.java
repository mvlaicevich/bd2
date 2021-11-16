package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadCart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActividadCartRepository extends MongoRepository<ActividadCart, String> {

    List<ActividadCart> findAllByCartId(String id);
}