package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.Producto;
import com.uade.tp.bd2.repository.ProductRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Producto getProductById(String id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Producto createProducto(Producto producto) {
        return productRepository.save(producto);
    }

    @Override
    public void deleteProducto(String productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Producto> getProducts() {
        return productRepository.findAll();
    }
}
