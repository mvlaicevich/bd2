package com.uade.tp.bd2.controller;

import com.uade.tp.bd2.model.ActividadCart;
import com.uade.tp.bd2.model.Cart;
import com.uade.tp.bd2.model.Pedido;
import com.uade.tp.bd2.service.ActividadCartService;
import com.uade.tp.bd2.service.CartService;
import com.uade.tp.bd2.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    private CartService cartService;
    private PedidoService pedidoService;
    private ActividadCartService actividadCartService;

    @Autowired
    public CartController(CartService cartService, PedidoService pedidoService, ActividadCartService actividadCartService) {
        this.cartService = cartService;
        this.pedidoService = pedidoService;
        this.actividadCartService = actividadCartService;
    }

    @GetMapping("/{userId}")
    @ResponseBody
    public Cart getCarrito(@PathVariable String userId) {
        Cart cart = cartService.getCartByUserId(userId);
        actividadCartService.crearActividadCart(ActividadCart.builder()
                .cartId(cart.getId())
                .sesionId(cart.getSesionId())
                .tipoActividad("Obtener carrito")
                .build());
        return cart;
    }

    @PostMapping()
    @ResponseBody
    public Cart crearCarrito(@RequestBody Cart cart) {
        Cart cartResponse = cartService.createCart(cart);
        actividadCartService.crearActividadCart(ActividadCart.builder()
                .cartId(cartResponse.getId())
                .sesionId(cart.getSesionId())
                .tipoActividad("Crear carrito")
                .build());
        return cartResponse;
    }

    @PutMapping()
    @ResponseBody
    public Cart updateCarrito(@RequestBody Cart cart) {
        actividadCartService.crearActividadCart(ActividadCart.builder()
                .cartId(cart.getId())
                .sesionId(cart.getSesionId())
                .tipoActividad("Actualizar carrito")
                .build());
        return cartService.createCart(cart);
    }

    @PostMapping("/pedido/{id}")
    @ResponseBody
    public Pedido crearPedido(@PathVariable String id) {
        Cart cart = cartService.getCartById(id);
        actividadCartService.crearActividadCart(ActividadCart.builder()
                .cartId(cart.getId())
                .sesionId(cart.getSesionId())
                .tipoActividad("Crear Pedido")
                .build());
        return pedidoService.createPedido(cart);
    }

    @GetMapping("/pedido/{id}")
    @ResponseBody
    public Pedido obtenerPedido(@PathVariable String id) {
        Pedido pedido = pedidoService.getPedidoById(id);
        actividadCartService.crearActividadCart(ActividadCart.builder()
                .cartId(pedido.getCartId())
                .sesionId(pedido.getSesion().getId())
                .tipoActividad("Obtener Pedido")
                .build());
        return pedido;
    }


}
