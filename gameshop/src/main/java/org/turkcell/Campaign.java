package org.turkcell;

public class Campaign {

    private int id;
    private String campaignName;
    private double discountRate;
    private Game game;

    public Campaign(int id, String campaignName, double discountRate, Game game) {
        this.id = id;
        this.campaignName = campaignName;
        this.discountRate = discountRate;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    public String getGameName(){
        return this.getGame().getGameName();
    }
}
