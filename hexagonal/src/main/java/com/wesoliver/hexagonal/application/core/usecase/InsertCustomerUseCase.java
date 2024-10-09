package com.wesoliver.hexagonal.application.core.usecase;

import com.wesoliver.hexagonal.application.core.domain.Customer;
import com.wesoliver.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.wesoliver.hexagonal.application.ports.out.FindAdrressByZipCodeOutputPort;
import com.wesoliver.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAdrressByZipCodeOutputPort findAdrressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAdrressByZipCodeOutputPort findAdrressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAdrressByZipCodeOutputPort = findAdrressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        var address = findAdrressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
