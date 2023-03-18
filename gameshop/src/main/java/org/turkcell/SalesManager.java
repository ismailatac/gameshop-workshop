package org.turkcell;

public class SalesManager {

    CampaignManager campaignManager;

    public SalesManager(CampaignManager campaignManager) {
        this.campaignManager = campaignManager;
    }

    public SalesManager() {
    }

    public void sell(Customer customer, Game game){


        //ArrayList allCampaigns = new ArrayList();
        for (Campaign c : campaignManager.getAllCampaigns()){
            if(c.getGameName() == game.getGameName()){
               double newGamePrice = game.getGamePrice()-(game.getGamePrice()*c.getDiscountRate()/100);
               game.setGamePrice(newGamePrice);
               customer.setGames(game);

            }
            System.out.println(game.getGameName()+" " + game.getGamePrice() +" fiyata "+customer.getFirstName()+" "+customer.getLastName()+" kişisine satıldı.");
        }
    }

}
