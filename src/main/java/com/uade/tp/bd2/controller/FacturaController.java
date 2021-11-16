package com.uade.tp.bd2.controller;

import com.uade.tp.bd2.model.ActividadCart;
import com.uade.tp.bd2.model.ActividadFactura;
import com.uade.tp.bd2.model.Cart;
import com.uade.tp.bd2.model.Factura;
import com.uade.tp.bd2.model.Pedido;
import com.uade.tp.bd2.service.ActividadFacturaService;
import com.uade.tp.bd2.service.FacturaService;
import com.uade.tp.bd2.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    private PedidoService pedidoService;
    private FacturaService facturaService;
    private ActividadFacturaService actividadFacturaService;

    @Autowired
    public FacturaController(PedidoService pedidoService, FacturaService facturaService) {
        this.pedidoService = pedidoService;
        this.facturaService = facturaService;
    }


    @PostMapping("/{formaPago}/{id}")
    @ResponseBody
    public Factura crearFactura(@PathVariable  String formaPago, @PathVariable String id) {

        Pedido pedido = pedidoService.getPedidoById(id);
        Factura factura = facturaService.createFactura(pedido, formaPago);
        actividadFacturaService.crearActividadFactura(ActividadFactura.builder()
                .idFactura(factura.getId())
                .actividad("Crear Factura por monto:" + factura.getTotal())
                .totalFacturado(factura.getTotal())
                .sesionId(pedido.getSesion().getId())
                .build());
        return factura;
    }
}
