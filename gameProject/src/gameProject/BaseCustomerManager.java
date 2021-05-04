package gameProject;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void registerCustomer(Customer customer) {
		System.out.println("Kayd�n�z olu�turuldu." + customer.getFirstName());
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.println("Kayd�n�z g�ncellendi. " + customer.getFirstName());
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		System.out.println("Kayd�n�z silindi." + customer.getFirstName());
		
	}

}
