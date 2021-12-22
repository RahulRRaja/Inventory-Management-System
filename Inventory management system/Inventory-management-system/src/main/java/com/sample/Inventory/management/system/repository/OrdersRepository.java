package com.sample.Inventory.management.system.repository;

import com.sample.Inventory.management.system.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer> {
}
