package com.company;

import java.util.*;

public class Player extends Turtle{

    public int number;
    private String color;
    private String direction;
    private int position;

    private ArrayList<Card> deck;
    private ArrayList<Card> discard;

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void setDiscard(ArrayList<Card> discard) {
        this.discard = discard;
    }



    

}
