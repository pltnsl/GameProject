package gameProject;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new GameShopCustomerManager (new CustomerCheckService() {
			
			@Override
			public boolean checkIfRealPerson(Customer customer) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Neslihan");
		customer.setLastName("PULAT");
		customer.setNationalityId("12321452100");
		customer.setYearofBirth("1991");
		
		customerManager.registerCustomer(customer);
		
		Product gameProduct = new Product();
		gameProduct.setId(1);
		gameProduct.setGameName("PubG");
		gameProduct.setGamePrice(95.80);
		gameProduct.setGameDiscount(0);
		
		GameTrade gameTrade = new GameTrade();
		gameTrade.sellProduct(customer, gameProduct);
		
		BaseCampaignManager campaignManager = new GameShopCampaignManager();
		campaignManager.newCampaign(gameProduct, 10);
		
        gameTrade.sellProduct(customer, gameProduct);
 		
		campaignManager.deleteCampign(gameProduct);
		gameTrade.sellProduct(customer, gameProduct);
		
		
		
		
		

	}

}
