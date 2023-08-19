package com.mycompany.gofishgameplay;
import java.util.ArrayList;

/*
 * Modifier: Meichao Zhao  991719472  
 *           Xiaoyi Zhang  991711956  
 */
public abstract class Player {

    protected String name;
    
    public Player(){}
    
    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
   
    /*public boolean hasGiven(Card cType)
    {
        return hand.contains(cType);
    }

    public ArrayList<GofishCard> giveAll(GofishCard cType)
    {
        ArrayList<GofishCard> x = new ArrayList<GofishCard>(); //Complicated because simply taking the cards as they
        for(int i=0;i<hand.size();i++)            //are found would mess up the traversing of the hand
            if (hand.get(i) == cType)
              x.add(hand.get(i));
        for(int c=0;c<x.size();c++)
            hand.remove(cType);
        return x;
    }

    protected boolean askFor(GofishCard cType)
    {
        int tmp = 0;
        if (this instanceof GofishHumanPlayer)
            tmp = 1;
        Player other = GofishGame.Players[tmp];

        //Used for the computer's strategy//
        if (tmp==1)
            ((GofishAIPlayer) other).queries.add(cType);
        //                               //

        if (other.hasGiven(cType))
        {
            for(GofishCard c: other.giveAll(cType))
                hand.add(c);
            return true;
        }
        else
        {
            return false;
        }
    }

    protected void fish()
	    {
	        if (GofishCard.deckSize() > 0)
	        	hand.add(GofishCard.draw());
	        else
	        	System.out.println("But that's impossible since the deck is empty.");
    }

    public int getNumBooks()
    {
        return numBooks;
    }

    protected GofishCard checkForBooks()
    {
        for(GofishCard c: hand) //Not very elegant!
        {
            int num = 0;
            for(Card d: hand)
              if (c == d)
                  num++;
            if (num == 4)
            {
                for(int i=0;i<4;i++)
                    hand.remove(c);
                numBooks++;
                return c;
            }
        }
        return null;


    }

    public abstract void haveTurn();*/

}
