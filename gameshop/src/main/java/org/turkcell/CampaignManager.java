package org.turkcell;

import java.util.ArrayList;

public class CampaignManager {

    private ArrayList<Campaign> campaigns = new ArrayList();


    public void addCampaign(Campaign campaign){
        campaigns.add(campaign);
        System.out.println(campaign.getCampaignName()+" kampanyası sisteme "+campaign.getGameName()+" için eklendi");
    }
    public void deleteCampaign(int id){
        System.out.println(id+ " nolu kampanya silindi.");
        campaigns.remove(id-1);
    }
    public void updateCampaign(int id, Campaign campaign){
        for (Campaign campaign1 : campaigns){
            if (campaign1.getId() == id){
                Campaign cm = campaign1;
                cm.setId(id);
                cm.setId(campaign.getId());
                cm.setCampaignName(campaign.getCampaignName());
                cm.setGame(campaign.getGame());
                cm.setDiscountRate(campaign.getDiscountRate());
                this.deleteCampaign(id);
                campaigns.add(cm);
                System.out.println(id+ "numaralı "+ cm.getCampaignName()+" kampanyası güncellendi");
                break;

            }

        }
        System.out.println("Güncellenecek kampanya bulunamadı");

    }
    public ArrayList<Campaign> getAllCampaigns(){

        return campaigns;
    }

}
