package com.wesoliver.hexagonal.application.ports.in;

import com.wesoliver.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
