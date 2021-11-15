package com.uade.tp.bd2.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.List;

@RedisHash("Sesion")
@Builder
@Getter
public class Sesion implements Serializable {
    @Id
    private String id;
    private User user;
    private List<Actividad> actividades;
}
