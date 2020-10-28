package springframework.customerMaintainance.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springframework.customerMaintainance.controller.CustomerDto;
import springframework.customerMaintainance.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	
	public List<CustomerDto> getAllCustomers(){
		List<CustomerDto> customers= new ArrayList<>();
		 customerRepository.findAll()
		 .forEach(customers::add);
		 return customers;
	}
	
	
	public Optional<CustomerDto> getCustomer(String id) {
		//return customers.stream().filter(Id->Id.getId().equals(id)).findFirst().get();
		return customerRepository.findById(id);
	}

	public void addCustomer(CustomerDto customerDto) {
		customerRepository.save(customerDto);
	}
	public void updateCustomer(String id, CustomerDto customerDto) {
//		for(int i=0;i<customers.size();i++) {
//			CustomerDto cd= customers.get(i);
//			if(cd.getId().equals(id)) {
//				customers.set(i, customerDto);
//				return;
//			}
//		}
		customerRepository.save(customerDto);
	}

	public void deleteCustomer(String id) {
		//customers.removeIf(Id-> Id.getId().equals(id));
		customerRepository.deleteById(id);
	}
	
}
