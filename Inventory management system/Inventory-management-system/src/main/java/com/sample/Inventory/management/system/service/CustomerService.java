package com.sample.Inventory.management.system.service;

import com.sample.Inventory.management.system.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer product);

    Customer getCustomer(Integer id);

    Customer editCustomer(Customer product);

    void deleteCustomer(Customer product);

    void deleteCustomer(Integer id);

    List<Customer> getAllCustomers();

    long countCustomers();
}
