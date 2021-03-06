package com.sample.Inventory.management.system.service.impl;

import com.sample.Inventory.management.system.entity.Orders;
import com.sample.Inventory.management.system.repository.OrdersRepository;
import com.sample.Inventory.management.system.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private EntityManager entityManager;

    @Override
    public Orders createOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public Orders getOrders(Integer id) {
        return ordersRepository.getOne(id);
    }

    @Override
    public Orders editOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public void deleteOrders(Orders orders) {
        ordersRepository.delete(orders);
    }

    @Override
    public void deleteOrders(Integer id) {
        ordersRepository.deleteById(id);
    }

    @Override
    public List<Orders> getAllOrders() {
        return ordersRepository.findAll(Sort.by(Sort.Direction.DESC, "oid"));
    }

    @Override
    public long countOrders() {
        return ordersRepository.count();
    }
    @Override
    public Integer getMaxId() {
        String sql = "Select max(e.oid) " //
                + " from " + Orders.class.getName() + " e ";

        Query query = entityManager.createQuery(sql, Integer.class);

        Integer orderId = null;

        if (query.getSingleResult() == null) {
            orderId = 1;
        } else {
            orderId = ((Integer) query.getSingleResult()) + 1;
        }

        return orderId;
    }

}
