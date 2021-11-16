package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Producto, String> {

}