package com.wesoliver.hexagonal.adapters.in.controller.mapper;

import com.wesoliver.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.wesoliver.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

}
