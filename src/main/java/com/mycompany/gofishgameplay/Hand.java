/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gofishgameplay;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author zhang
 */
public class Hand {
    List<GofishCard> handCards;
    GofishDeck gofishDeck;
    Map<GofishCard, Integer> matchMap;
    int handSize;
    
    public Hand(){}
    
    public Hand(int handSize, GofishDeck gofishDeck){
        this.handSize=handSize;
        this.gofishDeck = gofishDeck;
    }
    
    public List<GofishCard> getHandCards(){
        return this.handCards;
    }
    
    public void setHandCards(List<GofishCard> cards){
        this.handCards = cards;
    }

    public List<GofishCard> generateHandCards(int handSize){
        this.handCards = new ArrayList();
        for(int i = 0; i < handSize; i++){
            this.handCards.add(this.gofishDeck.getGofishDeck().get(i));
            gofishDeck.getGofishDeck().remove(i);
        }return this.handCards;
    }
    
    public GofishDeck getGofishDeck() {
        return gofishDeck;
    }

    public void setGofishDeck(GofishDeck gofishDeck) {
        this.gofishDeck = gofishDeck;
    }

    public Map<GofishCard, Integer> getMatchMap() {
        return matchMap;
    }

    public void setMatchMap(Map<GofishCard, Integer> matchMap) {
        this.matchMap = matchMap;
    }
    
    public Map<GofishCard, Integer> generateMatchMap(){
        Map<GofishCard, Integer> matchMap = new HashMap<>();
        for (GofishCard card : this.handCards) {
            matchMap.put(card,matchMap.getOrDefault(card, 0) + 1);
        }
        
        return matchMap;
    }

    public int getHandSize() {
        return handSize;
    }

    public void setHandSize(int handSize) {
        this.handSize = handSize;
    }
    
    public GofishCard callFetch(){
   
        GofishCard modeCard = null;
        int maxOccurrence = 0;

        for (Map.Entry<GofishCard, Integer> entry : matchMap.entrySet()) {
            if (entry.getValue() > maxOccurrence && entry.getValue()!=4) {
                maxOccurrence = entry.getValue();
                modeCard = entry.getKey();
            }
        }

        return modeCard;
    }   
    
    //Action of the player being called to fetch
    public ArrayList<GofishCard> takeFetch(GofishCard card){
        ArrayList<GofishCard> fetchedCards = new ArrayList();
        if(handCards.contains(card)){
            
            for(GofishCard i : handCards){
                if (i.getCardRank().equals(card.getCardRank())){
                    fetchedCards.add(i);
                    this.handCards.remove(card);
                }
            }
        }return fetchedCards;//return all fected card on hand
    }
    
    //Action of the player that get the fetched cards from other player
    public void getFetch(ArrayList<GofishCard> fetchedCards){
        for (GofishCard c : fetchedCards){
            handCards.add(c);
            putIntoMatch(c);
        }
        
    }
    
    //Action of the player has to go fish
    public void goFish(){
        Random random = new Random();
        if (!gofishDeck.getGofishDeck().isEmpty()) {
            int index = random.nextInt(gofishDeck.getGofishDeck().size());
            GofishCard fishedCard = gofishDeck.getGofishDeck().get(index);
            handCards.add(fishedCard);
            putIntoMatch(fishedCard);
            this.gofishDeck.getGofishDeck().remove(fishedCard);
}

    }
    
    public void putIntoMatch(GofishCard fishCard){
        matchMap.put(fishCard,matchMap.getOrDefault(fishCard, 0) + 1);
    }
    
}
