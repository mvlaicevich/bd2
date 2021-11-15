package com.uade.tp.bd2.controller;

import com.uade.tp.bd2.model.Sesion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sesion")
public class SesionController {

    @GetMapping("/{id}")
    @ResponseBody
    public Sesion getSession(@PathVariable String id) {
        return null;
    }

    @PostMapping("/{id}")
    @ResponseBody
    public Sesion logUser(@PathVariable String id) {
        return null;
    }
}
