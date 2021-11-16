package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadProducto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActividadProductRepository extends CrudRepository<ActividadProducto, String> {

    List<ActividadProducto> findAllByIdProducto(String id);
}