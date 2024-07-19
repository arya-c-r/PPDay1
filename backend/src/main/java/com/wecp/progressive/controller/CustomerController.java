package com.wecp.progressive.controller;


import com.wecp.progressive.entity.Customers;

import com.wecp.progressive.service.CustomerService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    public ResponseEntity<List<Customers>> getAllCustomers() throws SQLException{
        return ResponseEntity.ok(customerService.getAllCustomers());
    }
    @GetMapping("/{customerID}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable Integer customerID) throws SQLException{
        return ResponseEntity.ok(customerService.getCustomerById(customerID));
    }
    @PostMapping
    public ResponseEntity<Integer> addCustomer(@RequestBody Customers customers) throws SQLException {
        return new ResponseEntity<>(customerService.addCustomer(customers), HttpStatus.CREATED);
    }
    @PutMapping("/{customerID}")
    public ResponseEntity<Void> updateCustomer(@PathVariable int customerID,@RequestBody Customers customers) throws SQLException {
        customers.setCustomerId(customerID);
        customerService.updateCustomer(customers);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{customerID}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int customerID) throws SQLException {
        customerService.deleteCustomer(customerID);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
