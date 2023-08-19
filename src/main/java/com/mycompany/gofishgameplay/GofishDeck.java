package com.mycompany.gofishgameplay;

/**
 *
 * @author Xiaoyi Zhang  991711956
 *         Meichao Zhao  991719472  
 */
import com.mycompany.gofishgameplay.Suit;
import java.util.ArrayList;
import java.util.Collections;

public class GofishDeck {
    private ArrayList<GofishCard> gofishDeck;
    private int deck;
    

    public GofishDeck(int deck) {
	this.deck = deck;
        this.gofishDeck = new  ArrayList<GofishCard>();
        this.gofishDeck = shuffle();
    }

    public ArrayList<GofishCard> getGofishDeck() {
        return this.gofishDeck;    
    }


    public void setGofishDeck(ArrayList<GofishCard> gofishDeck) {
	this.gofishDeck = gofishDeck;
    }

    public int getDeck() {
	return this.deck;
    }


    public void setDeck(int deck) {
	this.deck = deck;
    }

    public ArrayList<GofishCard> shuffle() {
	Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        for(int j=0; j<=this.deck; j++){
            for(int i=0;i<suits.length;i++){
                for(int z=0; z<ranks.length;z++){
                GofishCard card = new GofishCard(suits[i].name(),ranks[z].name());
                this.gofishDeck.add(card);
                }
            }
        }
         Collections.shuffle(gofishDeck);
         return gofishDeck;
    }
}
