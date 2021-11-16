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
public class ActividadSesion {

    @Id
    private String id;
    private String sesionId;
    private String tipoActividad;
}
