package com.uade.tp.bd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("ActividadSesion")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ActividadSesion {

    @Id
    private String id;
    private String sesionId;
    private String tipoActividad;
}
