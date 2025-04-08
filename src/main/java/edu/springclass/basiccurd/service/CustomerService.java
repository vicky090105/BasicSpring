package edu.springclass.basiccurd.service;

import edu.springclass.basiccurd.entity.CustomerEntity;
import edu.springclass.basiccurd.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo repo;

    // Create || POST || SAVE
    public CustomerEntity addCustomer(CustomerEntity entity){
        return repo.save(entity);
    }

    // Get || READ || FindALL
    public List<CustomerEntity> getAllCustomer(){
     return repo.findAll();
    }

    // GET BY ID || READ
    public CustomerEntity getCustomerById(Integer id){
        return repo.findById(id).orElse(null);
    }
}
