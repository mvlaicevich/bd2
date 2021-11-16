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
public class ActividadFactura {

    @Id
    private String id;
    private String sesionId;
    private String idFactura;
    private String actividad;
    private double totalFacturado;;

}
