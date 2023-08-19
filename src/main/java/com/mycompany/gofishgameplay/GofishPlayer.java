/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gofishgameplay;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author zhang
 */
public class GofishPlayer extends Player{
    private Hand hand;
    protected GofishPlayer(){}
    
    protected GofishPlayer(String name){
        super(name);
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
    //Choose which other player to call fetch to
    public int fetchPlayer(ArrayList<GofishPlayer> players){
        Random random = new Random();
        int index =0;
        do{
            index = random.nextInt(players.size());
        }while(players.get(index).getName().equals(this.name));
        
        return index;
    }      
      
}
