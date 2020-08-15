package com.spring.controller;

import com.spring.entity.Customer;
import com.spring.error.exception.CustomerNotFoundException;
import com.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    // autowire the CustomerService - inject Service into controller
    @Autowired
    private CustomerService customerService;

    // add mapping for GET /customers
    @GetMapping("/customers")
    public List<Customer> getCustomers() {

        return customerService.getCustomers();

    }

    // add mapping for GET /customers/{customerId}
    //{customerId} is the path variable here

    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {

        Customer theCustomer = customerService.getCustomer(customerId);

        if (theCustomer == null) {
            throw new CustomerNotFoundException("Customer id not found - " + customerId);
        }

        return theCustomer;
    }

    // add mapping for POST /customers  - add new customer
    //@RequestBody binds the POJO to a method parameter / jackson will convert the request body from JSON to POJO
    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer) {

        // also just in case the pass an id in JSON ... set id to 0
        // this is force a save of new item ... instead of update

        theCustomer.setId(0);

        customerService.saveCustomer(theCustomer);

        return theCustomer;
    }

    // add mapping for PUT /customers - update existing customer

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer) {

        customerService.saveCustomer(theCustomer);

        return theCustomer;

    }

    // add mapping for DELETE /customers/{customerId} - delete customer

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId) {

        Customer tempCustomer = customerService.getCustomer(customerId);

        // throw exception if null

        if (tempCustomer == null) {
            throw new CustomerNotFoundException("Customer id not found - " + customerId);
        }

        customerService.deleteCustomer(customerId);

        return "Deleted customer id - " + customerId;
    }

}


















