package uk.co.joecastle.msscbrewery.service;

import uk.co.joecastle.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void saveCustomer(String customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
