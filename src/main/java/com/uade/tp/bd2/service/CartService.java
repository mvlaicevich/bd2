package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Cart;

public interface CartService {

    Cart getCartById(String id);

    Cart getCartByUserId(String userId);

    Cart createCart(Cart cart);
}
