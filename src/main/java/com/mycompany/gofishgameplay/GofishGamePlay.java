/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gofishgameplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author zhang
 */
public class GofishGamePlay {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter how many decks you want to play with: ");
        int deck = input.nextInt();
        GofishDeck fishDeck = new GofishDeck(deck);
        
        System.out.print("Enter the size of hand cards: ");
        int handSize = input.nextInt();
        
        System.out.print("Enter how many players to participate: ");
        int numPlayer = input.nextInt();
        input.nextLine();
        
        int i = 1;
        ArrayList<GofishPlayer> fishPlayers = new ArrayList<GofishPlayer>();
        
        while(i <= numPlayer){
            System.out.print("Enter name of Player" + i +" : ");
            
            String name = input.nextLine();
          
            GofishPlayer player = new GofishPlayer(name);
            
            Hand hand = new Hand(handSize,fishDeck);
            
            List<GofishCard> handCards = hand.generateHandCards(handSize);
            
            hand.setHandCards(handCards);
            
            hand.setMatchMap(hand.generateMatchMap());
           
            player.setHand(hand);
            
            fishPlayers.add(player); 
           
            i++;
        }
       
        GofishGame fishGame = new GofishGame(fishDeck,fishPlayers);
        
        fishGame.notifyPlayers();
        System.out.println("Winner: " + fishGame.getWinner());
    }
}
