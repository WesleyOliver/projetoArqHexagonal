package com.wesoliver.hexagonal.adapters.out.client.mapper;

import com.wesoliver.hexagonal.adapters.out.client.response.AddressResponse;
import com.wesoliver.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
