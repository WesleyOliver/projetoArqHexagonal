package com.wesoliver.hexagonal.adapters.out;

import com.wesoliver.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.wesoliver.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.wesoliver.hexagonal.application.core.domain.Address;
import com.wesoliver.hexagonal.application.ports.out.FindAdrressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAdrressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
