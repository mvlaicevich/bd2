package com.uade.tp.bd2.controller;

import com.uade.tp.bd2.model.Producto;
import com.uade.tp.bd2.model.Sesion;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {


    @GetMapping("/{id}")
    @ResponseBody
    public List<Producto> getProductos(@PathVariable int id) {
        return null;
    }

    @PostMapping()
    @ResponseBody
    public Producto createProducto() {
        return null;
    }

    @DeleteMapping("/{productId}")
    @ResponseBody
    public Producto deleteProducto(@PathVariable String productId) {
        return null;
    }

}
