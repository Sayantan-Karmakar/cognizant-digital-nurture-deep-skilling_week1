
public class CustomerService {
	
	public CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public void getDetails(String id) {
		customerRepository.findCustomerById(id);
	}
}
