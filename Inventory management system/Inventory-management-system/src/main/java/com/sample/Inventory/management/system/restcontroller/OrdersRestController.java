package com.sample.Inventory.management.system.restcontroller;

import com.sample.Inventory.management.system.entity.Orders;
import com.sample.Inventory.management.system.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrdersRestController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping(value = "/order", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Orders> getAllOrders() {
        return ordersService.getAllOrders();
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public Orders saveOrder(@RequestBody Orders orders) {
        ordersService.createOrders(orders);
        return orders;
    }

    @RequestMapping(value = "/updateOrder", method = RequestMethod.PUT)
    public Orders updateProduct(@RequestBody Orders p) {
        ordersService.editOrders(p);
        return p;
    }
}
