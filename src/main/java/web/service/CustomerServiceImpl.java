package web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerbyId(UUID customerId) {
		// TODO Auto-generated method stub
		return CustomerDto.Builder.newInstance().setCustomerId(UUID.randomUUID()).setCustomerName("Henry").build();
	}

}
