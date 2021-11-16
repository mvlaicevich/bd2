package com.uade.tp.bd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido {

    private int id;
    private String cartId;
    private Map<String, Integer> productos;
    private Sesion sesion;
    private List<Impuesto> impuestos;

}
