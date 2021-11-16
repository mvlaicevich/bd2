package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.ActividadProducto;
import com.uade.tp.bd2.model.Producto;
import com.uade.tp.bd2.repository.ActividadProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadProductoServiceImpl implements ActividadProductoService {

    private ActividadProductRepository actividadProductRepository;

    @Autowired
    public ActividadProductoServiceImpl(ActividadProductRepository actividadProductRepository) {
        this.actividadProductRepository = actividadProductRepository;
    }

    @Override
    public List<ActividadProducto> getActividadProductoByIdProducto(String id) {
        return actividadProductRepository.findAllByIdProducto(id);
    }

    @Override
    public void crearActividadProducto(ActividadProducto actividadProducto) {
        actividadProductRepository.save(actividadProducto);
    }
}
