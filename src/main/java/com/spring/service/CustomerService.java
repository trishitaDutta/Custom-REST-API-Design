package com.spring.service;

import com.spring.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer thecustomer);

    Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

    List<Customer> searchCustomers(String theSearchName);
}
