
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		
		CustomerService customerService = new CustomerService(customerRepository);
		
		customerService.getDetails("SK1107");
	}

}
