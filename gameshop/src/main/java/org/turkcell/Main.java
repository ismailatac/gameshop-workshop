package org.turkcell;

import java.util.ArrayList;

public class Main {

    static ArrayList<Customer> users = new ArrayList();

    public static void main(String[] args) {
        Customer c1 = new Customer(1, "11648965214", "Merve", "Demir", 1997);
        Customer c2 = new Customer(2, "56897456321", "Osman", "Şahin", 1998);
        Customer c3 = new Customer(3, "24687469985", "Ahmet", "Öztürk", 1991);
        Customer c4 = new Customer(4, "68974563215", "Taner", "Keskin", 1992);
        Customer c5 = new Customer(5, "56841235679", "Pınar", "Karaca", 1988);
        users.add(c1);
        users.add(c2);
        users.add(c3);
        users.add(c4);
        users.add(c5);

        CustomerManager cs = new CustomerManager(new VerifyMethod1());

        for (Customer c : users) {
            cs.addCustomer(c);
        }
        Game game1 = new Game(1,"Game1",555);
        Game game2 = new Game(2,"Game2",666);
        Game game3 = new Game(3,"Game3",777);

        Campaign campaign1 = new Campaign(1,"Kampanya1",60,game1);
        CampaignManager cm = new CampaignManager();
        cm.addCampaign(campaign1);

        SalesManager sm = new SalesManager(cm);
        sm.sell(c1,game1);
        for(Game g: c1.getOwnGames()){
            System.out.println(g.getGameName());
        }
        sm.sell(c2,game2);
        cm.deleteCampaign(1);
        Campaign campaign2 = new Campaign(2,"Kampanya2",77,game2);
        cm.addCampaign(campaign2);
        sm.sell(c3,game2);

        for(Game g : c2.getOwnGames()){
            System.out.println(g.getGameName());
        }
        for(Customer c : cs.getAllCustomers()){
            System.out.println(c.getId()+" "+c.getFirstName()+ " "+c.getLastName());
        }
        cs.deleteCustomer(2);
        for(Customer c : cs.getAllCustomers()){
            System.out.println(c.getId()+" "+c.getFirstName()+ " "+c.getLastName());
        }
        Customer newCustomer = new Customer(55,"12547896541","Mahmut","Koç",1996);
        cs.updateCustomer(1,newCustomer);
        for(Customer c : cs.getAllCustomers()){
            System.out.println(c.getId()+" "+c.getFirstName()+ " "+c.getLastName());
        }
    }
}