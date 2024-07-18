package com.otu.springboothotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.otu.springboothotel.model.Customer;
import com.otu.springboothotel.repository.CustomerRepository;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(int id, Customer updatedCustomer) {
        if (customerRepository.existsById(id)) {
            updatedCustomer.setId(id);
            return customerRepository.save(updatedCustomer);
        }
        return null;
    }
    
    public Customer getCustomerByIdWithBookings(int id) {
        return customerRepository.findByIdWithBookings(id);
    }

    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

}
