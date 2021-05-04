package gameProject;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void registerCustomer(Customer customer) {
		System.out.println("Kaydýnýz oluþturuldu." + customer.getFirstName());
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.println("Kaydýnýz güncellendi. " + customer.getFirstName());
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		System.out.println("Kaydýnýz silindi." + customer.getFirstName());
		
	}

}
