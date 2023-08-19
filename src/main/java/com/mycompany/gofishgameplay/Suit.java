package com.mycompany.gofishgameplay;
/*
 * Modifier: Meichao Zhao  991719472  
 *           Xiaoyi Zhang  991711956  
 */
public enum Suit {
    CLUBS("clubs"),DIAMONDS("diamonds"),HEARTS("hearts"),SPADES("spades");
    
    private final String value;

    private Suit(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
