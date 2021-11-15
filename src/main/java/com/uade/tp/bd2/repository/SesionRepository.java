package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.Sesion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SesionRepository extends CrudRepository<Sesion, String> {}