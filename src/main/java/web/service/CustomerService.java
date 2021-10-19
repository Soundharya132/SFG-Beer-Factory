package web.service;

import java.util.UUID;

import web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerbyId(UUID customerId);
}
