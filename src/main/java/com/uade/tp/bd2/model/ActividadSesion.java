package com.uade.tp.bd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActividadSesion {

    @MongoId
    private String id;
    private String sesionId;
    private String tipoActividad;
}
