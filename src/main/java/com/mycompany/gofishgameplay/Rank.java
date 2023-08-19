package com.mycompany.gofishgameplay;

/*
 * Modifier: Meichao Zhao  991719472  
 *           Xiaoyi Zhang  991711956  
 */
public enum Rank {
    ONE("one"),TWO("two"),THREE("three"),FOUR("four"),FIVE("five"),SIX("six"),
    SEVEN("seven"),EIGHT("eight"),NINE("nine"),JACK("jack"),QUEEN("queen"),KING("king");
    
    private final String value;
    
    private Rank(String value){
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}
