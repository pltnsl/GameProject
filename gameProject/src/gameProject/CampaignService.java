package gameProject;

public interface CampaignService {
	void newCampaign(Product product, double discountCampaign);
	void updateCampaign(Product product, double discountCampaign);
    void deleteCampign(Product product);

}
