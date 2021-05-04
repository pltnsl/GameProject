package gameProject;

public abstract class BaseCampaignManager implements CampaignService {

	@Override
	public void newCampaign(Product product, double discountCampaign) {
		product.setGameDiscount(discountCampaign);
		System.out.println(product.getGameName() + " " + "�r�n� i�in" + " " + product.getGameDiscount() + " " +  "kampanya olu�turuldu" );
		
	}

	@Override
	public void updateCampaign(Product product, double discountCampaign) {
		System.out.println(product.getGameName() + "�r�n� i�in" +"  " + product.getGameDiscount() + "kampanya g�ncellendi" );
		
	}

	@Override
	public void deleteCampign(Product product) {
		System.out.println(product.getGameName() + " " + "�r�n� i�in" +" " +  product.getGameDiscount() +" " + "kampanya silindi" );
		
	}

	
	

}
