package org.turkcell;

import java.util.ArrayList;

public class CampaignManager {

    private ArrayList<Campaign> campaigns = new ArrayList();


    public void addCampaign(Campaign campaign){
        campaigns.add(campaign);
    }
    public void deleteCampaign(int id){
        campaigns.remove(id);
    }
    public void updateCampaign(int id, Campaign campaign){
        for (Campaign campaign1 : campaigns){
            if (campaign1 == campaign){
                Campaign cm = campaign1;
                this.deleteCampaign(id);
                cm.setId(id);
                cm.setId(campaign.getId());
                cm.setCampaignName(campaign.getCampaignName());
                cm.setGame(campaign.getGame());
                cm.setDiscountRate(campaign.getDiscountRate());

                campaigns.add(cm);

            }
        }
        System.out.println("güncellendi");
    }
    public ArrayList<Campaign> getAllCampaigns(){
        return this.campaigns;
    }

}
