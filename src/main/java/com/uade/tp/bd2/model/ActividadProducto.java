package com.uade.tp.bd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash("ActividadProducto")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ActividadProducto {

    @Id
    private String id;
    @Indexed
    private String sesionId;
    @Indexed
    private String idProducto;
    private String tipoOperacion;
    private String valorAnterior;
    private String valorNuevo;

}
