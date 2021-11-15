package com.uade.tp.bd2.controller;

import com.uade.tp.bd2.model.Sesion;
import com.uade.tp.bd2.model.User;
import com.uade.tp.bd2.service.SesionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sesion")
public class SesionController {

    private SesionService sesionService;

    @Autowired
    public SesionController(SesionService sesionService) {
        this.sesionService = sesionService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Sesion logUser(@RequestBody User user) {
        return sesionService.createSesion(user);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Sesion getSession(@PathVariable String id) {
        return sesionService.getSesionById(id);
    }


}
