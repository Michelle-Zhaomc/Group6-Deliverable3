package com.mycompany.gofishgameplay;

import java.util.ArrayList;

/**
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @Modiifer Xiaoyi Zhang  991711956
 *           Meichao Zhao  991719472 
 */
public abstract class Game {

    protected String name;//the title of the game
    protected ArrayList<Player> players;// the players of the game
    
    protected Game(){}

    protected Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public abstract void notifyPlayers();
    
    public abstract boolean declareWinner();
}
