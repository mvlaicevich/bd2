package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadFactura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActividadFacturaRepository extends CrudRepository<ActividadFactura, String> {

    List<ActividadFactura> findAllByFacturaId(String id);

}
