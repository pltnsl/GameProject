package gameProject;

public class GameTrade {
	public void sellProduct(Customer customer, Product product) {
		if(customer.getStatus()) {
			System.out.println(product.getGameName()+ "oyunu" + String.format("%5g", product.getGamePrice())
			+ "Tl kar��l���nda" + customer.getFirstName()+ "sat�n alm��t�r");
			
		}else {
			System.out.println("Sat�� ba�ar�s�z, l�tfen kontrol edin!");
		}
	}

}
