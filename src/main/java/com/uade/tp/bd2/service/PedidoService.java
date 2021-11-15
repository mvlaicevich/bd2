package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Cart;
import com.uade.tp.bd2.model.Pedido;

public interface PedidoService {

    Pedido createPedido(Cart cart);

}
