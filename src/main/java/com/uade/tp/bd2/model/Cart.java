package com.uade.tp.bd2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
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
@Data
public class Cart {

    @Id
    private String id;
    private String sesionId;
    private Map<Producto,Integer> Productos;

}
