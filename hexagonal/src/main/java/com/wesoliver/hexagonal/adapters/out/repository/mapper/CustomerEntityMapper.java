package com.wesoliver.hexagonal.adapters.out.repository.mapper;

import com.wesoliver.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.wesoliver.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}
