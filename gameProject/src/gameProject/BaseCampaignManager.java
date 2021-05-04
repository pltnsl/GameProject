package gameProject;

public abstract class BaseCampaignManager implements CampaignService {

	@Override
	public void newCampaign(Product product, double discountCampaign) {
		product.setGameDiscount(discountCampaign);
		System.out.println(product.getGameName() + " " + "ürünü için" + " " + product.getGameDiscount() + " " +  "kampanya oluþturuldu" );
		
	}

	@Override
	public void updateCampaign(Product product, double discountCampaign) {
		System.out.println(product.getGameName() + "ürünü için" +"  " + product.getGameDiscount() + "kampanya güncellendi" );
		
	}

	@Override
	public void deleteCampign(Product product) {
		System.out.println(product.getGameName() + " " + "ürünü için" +" " +  product.getGameDiscount() +" " + "kampanya silindi" );
		
	}

	
	

}
