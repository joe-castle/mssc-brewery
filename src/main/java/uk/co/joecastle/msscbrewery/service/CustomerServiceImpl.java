package uk.co.joecastle.msscbrewery.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uk.co.joecastle.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto
                .builder()
                .id(UUID.randomUUID())
                .name("John Thompson")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto
                .builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void saveCustomer(String customerId, CustomerDto customerDto) {
        // TODO
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer with id: {}", customerId);
    }

}
