package com.sample.Inventory.management.system.service.impl;

import com.sample.Inventory.management.system.entity.Customer;
import com.sample.Inventory.management.system.repository.CustomerRepository;
import com.sample.Inventory.management.system.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer Customer) {
        return customerRepository.save(Customer);
    }

    @Override
    public Customer getCustomer(Integer id) {
        return customerRepository.getOne(id);
    }

    @Override
    public Customer editCustomer(Customer Customer) {
        return customerRepository.save(Customer);
    }

    @Override
    public void deleteCustomer(Customer Customer) {
        customerRepository.delete(Customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll(Sort.by(Sort.Direction.DESC, "cid"));
    }

    @Override
    public long countCustomers() {
        return customerRepository.count();
    }
}
