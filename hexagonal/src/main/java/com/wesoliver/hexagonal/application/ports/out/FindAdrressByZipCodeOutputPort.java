package com.wesoliver.hexagonal.application.ports.out;

import com.wesoliver.hexagonal.application.core.domain.Address;

public interface FindAdrressByZipCodeOutputPort {

    Address find(String zipCode);

}
