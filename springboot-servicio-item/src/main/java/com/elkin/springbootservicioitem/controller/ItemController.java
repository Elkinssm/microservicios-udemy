package com.elkin.springbootservicioitem.controller;

import com.elkin.springbootservicioitem.models.Item;
import com.elkin.springbootservicioitem.models.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    @Qualifier("serviceFeign")
    private ItemService itemService;

    @GetMapping("/listar")
    public List<Item> listar(@RequestParam(name = "nombre") String nombre, @RequestHeader(name = "token-request") String token) {
        System.out.println(nombre);
        System.out.println(token);
        return itemService.findAll();
    }

    @GetMapping("/ver/{id}/cantidad/{cantidad}")
    public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
        return itemService.findById(id, cantidad);
    }
}
