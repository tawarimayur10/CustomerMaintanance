package springframework.customerMaintainance.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springframework.customerMaintainance.service.CustomerService;

import java.util.*;


@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/All")
	public List<CustomerDto> getAllCustomers(){
		return customerService.getAllCustomers();
		
	}

	@GetMapping("/{customerId}")
	public Optional<CustomerDto> getCustomer(@PathVariable("customerId") String id) {
		return customerService.getCustomer(id);
	}
	
	@PostMapping("/createCustomer")
	
	public void addCustomer(@RequestBody CustomerDto customerDto) {
		customerService.addCustomer(customerDto);
	}
	
	@PutMapping("/{customerId}")
	public void updateCustomer(@RequestBody CustomerDto customerDto, @PathVariable("customerId") String id) {
		customerService.updateCustomer(id, customerDto);
	}
	
	@DeleteMapping("/{customerId}")
	public void DeleteCustomer(@PathVariable("customerId") String id) {
		customerService.deleteCustomer(id);
	}
	
}
