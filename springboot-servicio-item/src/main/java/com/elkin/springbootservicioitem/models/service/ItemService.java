package com.elkin.springbootservicioitem.models.service;

import com.elkin.springbootservicioitem.models.Item;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();

    public Item findById(Long id, Integer cantidad);
}
