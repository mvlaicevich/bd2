package com.uade.tp.bd2.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Sesion")
@Builder
@Getter
@Data
public class Sesion implements Serializable {
    @Id
    private String id;
    private User user;
}
