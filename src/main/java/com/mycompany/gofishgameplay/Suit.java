/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gofishgameplay;
/**
 *
 * @author zhang
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
