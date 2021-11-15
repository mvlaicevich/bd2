package com.uade.tp.bd2.controller;

import com.uade.tp.bd2.model.Cart;
import com.uade.tp.bd2.model.Pedido;
import com.uade.tp.bd2.service.CartService;
import com.uade.tp.bd2.service.PedidoService;
import com.uade.tp.bd2.service.PedidoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cart")
public class CartController {

    private CartService cartService;
    private PedidoService pedidoService;

    @Autowired
    public CartController(CartService cartService, PedidoService pedidoService) {
        this.cartService = cartService;
        this.pedidoService = pedidoService;
    }

    @GetMapping("/{userId}")
    @ResponseBody
    public Cart getCarrito(@PathVariable int userId) {
        return cartService.getCartByUserId(userId);
    }

    @PostMapping("/{id}")
    @ResponseBody
    public Pedido crearPedido(@PathVariable int id) {
        Cart cart = cartService.getCartById(id);

        return pedidoService.createPedido(cart);
    }


}
