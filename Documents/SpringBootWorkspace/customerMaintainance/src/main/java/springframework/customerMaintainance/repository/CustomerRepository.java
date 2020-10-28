package springframework.customerMaintainance.repository;

import org.springframework.data.repository.CrudRepository;

import springframework.customerMaintainance.controller.CustomerDto;

public interface CustomerRepository extends CrudRepository<CustomerDto,String>{

	
}
