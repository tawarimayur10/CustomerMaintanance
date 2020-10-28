package springframework.customerMaintainance.controller;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class CustomerDto {
	
	@Id
	private String CustomerId;
	private String CustomerName;
	
	
	public CustomerDto() {
		
	}
	public CustomerDto(String id, String customerName) {
		super();
		this.CustomerId = id;
		this.CustomerName = customerName;
	}

	
	public String getId() {
		return CustomerId;
	}
	public void setId(String id) {
		this.CustomerId = id;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
}
