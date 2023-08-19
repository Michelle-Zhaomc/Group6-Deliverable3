/*
 * Modifier: Meichao Zhao  991719472  
 *           Xiaoyi Zhang  991711956  
 */
package com.mycompany.gofishgameplay;
public abstract class Card {
    protected String suit;
    protected String rank;
    
    public Card(){ }
    
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }
    
    public String getCardSuit(){
        
        return this.suit;
    }
    
    public void setCardSuit(String suit){
        this.suit = suit;
    }
    
     public String getCardRank(){
        return this.rank;
    }
     
     public void setCardRank(String rank){
        this.rank=rank;
    }
     
//    @Override
//    public abstract String toString();

}
