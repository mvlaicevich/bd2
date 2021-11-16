package com.uade.tp.bd2.controller;

import com.uade.tp.bd2.model.ActividadProducto;
import com.uade.tp.bd2.model.Producto;
import com.uade.tp.bd2.service.ActividadProductoService;
import com.uade.tp.bd2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    private ActividadProductoService actividadProductoService;

    @Autowired
    public ProductController(ProductService productService, ActividadProductoService actividadProductoService) {
        this.productService = productService;
        this.actividadProductoService = actividadProductoService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Producto getProducto(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping()
    @ResponseBody
    public Producto createProducto(@RequestBody Producto producto) {
        Producto newProducto = productService.createProducto(producto);
        guardarActividadProducto(newProducto, "Creacion");
        return newProducto;
    }

    @PutMapping()
    @ResponseBody
    public Producto updateProducto(@RequestBody Producto producto) {
        guardarActividadProducto(producto, "Modificacion");
        return productService.createProducto(producto);
    }

    @DeleteMapping("/{productId}")
    @ResponseBody
    public void deleteProducto(@PathVariable String productId) {
        guardarActividadProducto(productService.getProductById(productId), "Eliminacion");
        productService.deleteProducto(productId);
    }

    @GetMapping()
    @ResponseBody
    public List<Producto> getProductos() {
        return productService.getProducts();
    }

    @GetMapping("/actividad/{id}")
    @ResponseBody
    public List<ActividadProducto> getActvidadesProducto(@PathVariable String id) {
        return actividadProductoService.getActividadProductoByIdProducto(id);
    }


    private void guardarActividadProducto(Producto producto, String tipoOperacion) {
            actividadProductoService.crearActividadProducto(ActividadProducto.builder()
                    .idProducto(producto.getId())
                    .valorAnterior(productService.getProductById(producto.getId()).toString())
                    .valorNuevo(producto.toString())
                    .tipoOperacion(tipoOperacion)
                    .idUsuario("")
                    .build());
    }

}
