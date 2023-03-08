package com.elkin.springbootserviciosproductos.models.service;

import com.elkin.springbootserviciosproductos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto findById(Long id);

}
