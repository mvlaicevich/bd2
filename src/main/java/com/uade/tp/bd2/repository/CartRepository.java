package com.uade.tp.bd2.repository;

import com.uade.tp.bd2.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, String> {

    Cart findBySesionId(String sesionId);

}