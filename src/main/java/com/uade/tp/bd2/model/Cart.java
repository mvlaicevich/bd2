package com.uade.tp.bd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.Map;

@RedisHash("Cart")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    @Id
    private String id;
    private String userId;
    private Map<Producto,Integer> Productos;

}
