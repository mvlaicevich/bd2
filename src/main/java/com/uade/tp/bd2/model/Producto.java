package com.uade.tp.bd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    private String id;
    private String descripcion;
    private List<String> imagenes;
    private List<String> comentarios;
    private String video;
    private double precio;

}
