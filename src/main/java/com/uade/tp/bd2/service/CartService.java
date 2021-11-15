package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Cart;

public interface CartService {

    Cart getCartById(int id);

    Cart getCartByUserId(int userId);
}
