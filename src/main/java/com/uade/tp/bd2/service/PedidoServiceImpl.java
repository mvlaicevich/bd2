package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Cart;
import com.uade.tp.bd2.model.Pedido;
import com.uade.tp.bd2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private SesionService sesionService;
    private PedidoRepository pedidoRepository;

    @Autowired
    public PedidoServiceImpl(SesionService sesionService, PedidoRepository pedidoRepository) {
        this.sesionService = sesionService;
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public Pedido createPedido(Cart cart) {
        Pedido pedido = Pedido.builder()
                .cartId(cart.getId())
                .productos(cart.getProductos())
                .sesion(sesionService.getSesionById(cart.getSesionId()))
                .build();
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido getPedidoById(String id) {
        return pedidoRepository.findById(id).get();
    }
}
