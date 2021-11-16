package com.uade.tp.bd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private int id;
    private Map<Producto, Integer> productos;
    private Sesion sesion;
    private String formaPago;

}
