package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Cart;
import com.uade.tp.bd2.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private SesionService sesionService;

    @Autowired
    public PedidoServiceImpl(SesionService sesionService) {
        this.sesionService = sesionService;
    }

    @Override
    public Pedido createPedido(Cart cart, String formaPago) {
        Pedido pedido = Pedido.builder()
                .productos(cart.getProductos())
                .sesion(sesionService.getSesionById(cart.getSesionId()))
                .formaPago(formaPago)
                .build();

        return pedido;
    }
}
