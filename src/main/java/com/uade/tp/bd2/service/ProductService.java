package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Producto;

import java.util.List;

public interface ProductService {

    Producto getProductById(String id);

    Producto createProducto(Producto producto);

    void deleteProducto(String productId);

    List<Producto> getProducts();
}
