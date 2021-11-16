package com.uade.tp.bd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActividadProducto {

    @Id
    private String id;
    private String idUsuario;
    private String idProducto;
    private String tipoOperacion;
    private String valorAnterior;
    private String valorNuevo;

}
