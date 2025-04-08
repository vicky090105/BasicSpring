package edu.springclass.basiccurd.controller;

import edu.springclass.basiccurd.entity.CustomerEntity;
import edu.springclass.basiccurd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    // POST
    @PostMapping("/create")
    public ResponseEntity<CustomerEntity> postCustomer(@RequestBody CustomerEntity en){
        return ResponseEntity.status(HttpStatusCode.valueOf(200))
                .body(customerService.addCustomer(en));
    }

    // GET
    @GetMapping("/all")
    public ResponseEntity<List<CustomerEntity>> getAllCustomer(){
        return ResponseEntity.status(HttpStatusCode.valueOf(200))
                .body(customerService.getAllCustomer());
    }
}
