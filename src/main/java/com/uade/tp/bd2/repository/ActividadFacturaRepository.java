package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadFactura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActividadFacturaRepository extends MongoRepository<ActividadFactura, String> {

    List<ActividadFactura> findAllByFacturaId(String id);

}
