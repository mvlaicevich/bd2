package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Cart;
import com.uade.tp.bd2.model.Factura;
import com.uade.tp.bd2.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FacturaServiceImpl implements FacturaService {

    private SesionService sesionService;

    @Autowired
    public FacturaServiceImpl(SesionService sesionService) {
        this.sesionService = sesionService;
    }

    @Override
    public Factura createFactura(Pedido pedido, String formaPago) {
        Factura factura = Factura.builder()
                .pedido(pedido)
                .formaPago(formaPago)
                .total(calcularTotal(pedido))
                .build();

        return factura;
    }

    private double calcularTotal(Pedido pedido) {
        List<Double> montoPedidos = pedido.getProductos().entrySet().stream().map(x -> x.getKey().getPrecio() * x.getValue()).collect(Collectors.toList());

        return montoPedidos.stream().mapToDouble(Double::doubleValue).sum();
    }
}
