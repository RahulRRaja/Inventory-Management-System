package com.sample.Inventory.management.system.restcontroller;

import com.sample.Inventory.management.system.entity.Customer;
import com.sample.Inventory.management.system.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/allCustomer", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/getCustomerById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Customer getCustomer(@PathVariable("id") String id) {
        Customer customer = customerService.getCustomer(Integer.parseInt(id));
        return customer;
    }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST, headers = "Accept=application/json")
    public Customer saveCustomer(@RequestBody Customer p) {
        customerService.createCustomer(p);
        return p;
    }

    @RequestMapping(value = "/updateCustomer", method = RequestMethod.PUT)
    public Customer updateCustomer(@RequestBody Customer p) {
        customerService.editCustomer(p);
        return p;
    }

    @RequestMapping(value = "/deleteCustomer/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public Customer deleteCustomer(@PathVariable("id") String id) {
        customerService.deleteCustomer(Integer.parseInt(id));
        Customer p = new Customer();
        return p;
    }

}
