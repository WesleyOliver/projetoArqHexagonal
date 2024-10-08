package com.wesoliver.hexagonal.adapters.in.controller;

import com.wesoliver.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.wesoliver.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.wesoliver.hexagonal.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid CustomerRequest customerRequest){
        var custumer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(custumer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }
}
