package com.uade.tp.bd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Factura {

    @Id
    private String id;
    private Pedido pedido;
    private String formaPago;
    private double total;
}
