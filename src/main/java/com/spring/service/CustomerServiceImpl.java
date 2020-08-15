package com.spring.service;

import com.spring.dao.CustomerDAO;
import com.spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    //need to inject CustomerDAO and we delegate the method call to DAO
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {

        //delegate the method call to CustomerDAO
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer thecustomer) {

        customerDAO.saveCustomer(thecustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId) {

        return customerDAO.getCustomer(theId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId) {

        //delegate the method to CustomerDAO
       customerDAO.deleteCustomer(theId);
    }

    @Override
    @Transactional
    public List<Customer> searchCustomers(String theSearchName) {

        return customerDAO.searchCustomers(theSearchName);
    }
}


