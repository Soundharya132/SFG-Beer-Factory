package web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.model.CustomerDto;
import web.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping({"/{customerId}"})
		public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId  ){
		return new ResponseEntity(customerService.getCustomerbyId(customerId),HttpStatus.OK);
	}

}
