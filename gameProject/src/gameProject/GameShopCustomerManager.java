package gameProject;

public class GameShopCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public GameShopCustomerManager (CustomerCheckService customerCheckService){
		this.customerCheckService= customerCheckService;
		
	}

	@Override
	public void registerCustomer(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			customer.setStatus(true);
		
		    super.registerCustomer(customer);
		}else {
			customer.setStatus(false);
			System.out.println("Doðrulama Baþarýsýz");
		}
	}

	@Override
	public void updateCustomer(Customer customer) {
		
		super.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		
		super.deleteCustomer(customer);
	}

}
