/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gofishgameplay;

/**
 *
 * @author zhang
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
