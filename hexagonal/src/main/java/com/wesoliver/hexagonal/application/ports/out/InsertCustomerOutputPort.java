package com.wesoliver.hexagonal.application.ports.out;

import com.wesoliver.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
