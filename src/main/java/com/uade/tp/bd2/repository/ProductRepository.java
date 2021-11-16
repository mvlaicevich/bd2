package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Producto, String> {

}