package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.Sesion;
import com.uade.tp.bd2.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SesionRepository extends CrudRepository<Sesion, String> {

    Sesion findByUser(User user);
}