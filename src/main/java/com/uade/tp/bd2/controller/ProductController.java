package com.uade.tp.bd2.controller;

import com.uade.tp.bd2.model.Producto;
import com.uade.tp.bd2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Producto getProducto(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping()
    @ResponseBody
    public Producto createProducto(@RequestBody Producto producto) {
        return productService.createProducto(producto);
    }

    @DeleteMapping("/{productId}")
    @ResponseBody
    public void deleteProducto(@PathVariable String productId) {
        productService.deleteProducto(productId);
    }

    @GetMapping()
    @ResponseBody
    public List<Producto> getProductos() {
        return productService.getProducts();
    }

}
