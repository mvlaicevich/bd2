package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Factura;
import com.uade.tp.bd2.model.Pedido;

public interface FacturaService {

    Factura createFactura(Pedido pedido, String formaPago);

    Factura getFacturaById(String id);
}
