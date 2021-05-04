package gameProject;

public class GameTrade {
	public void sellProduct(Customer customer, Product product) {
		if(customer.getStatus()) {
			System.out.println(product.getGameName()+ "oyunu" + String.format("%5g", product.getGamePrice())
			+ "Tl karþýlýðýnda" + customer.getFirstName()+ "satýn almýþtýr");
			
		}else {
			System.out.println("Satýþ baþarýsýz, lütfen kontrol edin!");
		}
	}

}
