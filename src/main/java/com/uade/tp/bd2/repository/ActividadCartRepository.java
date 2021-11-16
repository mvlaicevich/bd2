package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.ActividadCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActividadCartRepository  extends CrudRepository<ActividadCart, String> {

    List<ActividadCart> findAllByCartId(String id);
}