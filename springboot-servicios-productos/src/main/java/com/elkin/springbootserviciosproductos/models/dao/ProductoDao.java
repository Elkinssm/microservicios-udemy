package com.elkin.springbootserviciosproductos.models.dao;

import com.elkin.springbootserviciosproductos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long> {
}
