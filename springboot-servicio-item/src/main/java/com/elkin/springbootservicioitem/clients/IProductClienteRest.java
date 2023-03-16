package com.elkin.springbootservicioitem.clients;

import com.elkin.springbootservicioitem.models.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "servicio-productos")
public interface IProductClienteRest {

    /*
     * Endpoints del microservicio que queremos consumir en este caso productos
     */
    @GetMapping("/listar")
    public List<Producto> listar();

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id);

}
