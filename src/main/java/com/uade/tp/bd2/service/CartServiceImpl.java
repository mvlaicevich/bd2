package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Cart;
import com.uade.tp.bd2.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

    private CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart getCartById(String id) {
        return cartRepository.findById(id).get();
    }

    @Override
    public Cart getCartByUserId(String userId) {
        return cartRepository.findBySesionId(userId);
    }

    @Override
    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }
}
