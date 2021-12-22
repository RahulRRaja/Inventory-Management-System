package com.sample.Inventory.management.system.service;

import com.sample.Inventory.management.system.entity.Orders;

import java.util.List;

public interface OrdersService {
    Orders createOrders(Orders orders);

    Orders getOrders(Integer id);

    Orders editOrders(Orders orders);

    void deleteOrders(Orders orders);

    void deleteOrders(Integer id);

    List<Orders> getAllOrders();

    long countOrders();

    Integer getMaxId();
}
