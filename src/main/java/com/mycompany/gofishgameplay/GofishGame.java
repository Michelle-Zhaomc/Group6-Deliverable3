package com.mycompany.gofishgameplay;

import java.util.ArrayList;

/**
  * @author Xiaoyi Zhang  991711956
 *          Meichao Zhao  991719472 
 */
public class GofishGame extends Game{     
 
   GofishDeck gofishDeck;
   String winner;
   protected ArrayList<GofishPlayer> fishPlayers;
   
   protected GofishGame(){
       super("Go Fish");
   }
   
   protected GofishGame(GofishDeck gofishDeck, ArrayList<GofishPlayer> fishPlayers){
       super("Go Fish");
       this.gofishDeck = gofishDeck;
       this.fishPlayers = fishPlayers != null ? fishPlayers : new ArrayList<>();
   }
   
   public void addPlayer(GofishPlayer player){
       fishPlayers.add(player);
   }

    public ArrayList<GofishPlayer> getFishPlayers() {
        return fishPlayers;
    }

    public void setFishPlayers(ArrayList<GofishPlayer> fishPlayers) {
        this.fishPlayers = fishPlayers;
    }

   public String getWinner() {
        return winner;
    }

   public void setWinner(String winner) {
        this.winner = winner;
    }
   
   @Override
   public void notifyPlayers(){
       int i =0;
       while(!declareWinner() && !gofishDeck.getGofishDeck().isEmpty()){
           System.out.println(1);
           if(i != fishPlayers.size()-1){
               System.out.println(2);
               GofishPlayer caller = fishPlayers.get(i);
               System.out.println(3);
               GofishPlayer fetchedPlayer = fishPlayers.get(caller.fetchPlayer(fishPlayers));
               System.out.println(4);
               if(fetchedPlayer.getHand().takeFetch(caller.getHand().callFetch()).isEmpty()){
                   System.out.println(5);
                   caller.getHand().goFish();
               }else{
                   System.out.println(6);
                 ArrayList<GofishCard> fetchedCards=fetchedPlayer.getHand().takeFetch(caller.getHand().callFetch());
                 System.out.println(7);
                 caller.getHand().getFetch(fetchedCards);
                 System.out.println(8);
               }
               System.out.println(9);
               i++;
               
           }else{
               System.out.println(10);
               i = 0;
           }
       }System.out.println("Size of deck is " + gofishDeck.getGofishDeck().size());
   }
   
   @Override
   public boolean declareWinner(){
       for(GofishPlayer player : fishPlayers){
            if(player.getHand().getMatchMap().values().contains(4)){
                setWinner(player.getName());
                return true;
                
            }
        }
       setWinner("no winner");
       return false;
       
   }
}
