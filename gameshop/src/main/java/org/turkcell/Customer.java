package org.turkcell;

import java.util.ArrayList;

public class Customer extends User{

    private Game games;
    private ArrayList<Game> ownGames = new ArrayList();

    public Customer(int id, String identityNumber, String firstName, String lastName, int birthYear) {
        super(id, identityNumber, firstName, lastName, birthYear);

    }

    public Game getGames() {
        return games;
    }

    public void setGames(Game game) {
        this.ownGames.add(game);
    }

    public ArrayList<Game> getOwnGames() {
        return ownGames;
    }

    public void setOwnGames(ArrayList<Game> ownGames) {
        this.ownGames = ownGames;
    }
}
