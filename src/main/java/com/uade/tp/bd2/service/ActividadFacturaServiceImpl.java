package com.uade.tp.bd2.service;

import com.uade.tp.bd2.model.ActividadFactura;
import com.uade.tp.bd2.repository.ActividadFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadFacturaServiceImpl implements ActividadFacturaService {

    private ActividadFacturaRepository actividadFacturaRepository;

    @Autowired
    public ActividadFacturaServiceImpl(ActividadFacturaRepository actividadFacturaRepository) {
        this.actividadFacturaRepository = actividadFacturaRepository;
    }

    @Override
    public List<ActividadFactura> getActividadFacturaByFacturaId(String id) {
        return actividadFacturaRepository.findAllByFacturaId(id);
    }

    @Override
    public void crearActividadFactura(ActividadFactura actividadFactura) {
        actividadFacturaRepository.save(actividadFactura);
    }
}
