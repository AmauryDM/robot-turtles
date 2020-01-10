package com.company;

import java.util.*;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();
    private ArrayList<Card> obstacle = new ArrayList<Card>();

    public Deck() {
    }

    public ArrayList<Card> createDeck() {

        for (int i = 0; i < 18; i++) {
            deck.add(new Card());
        }

        for (int i = 0; i < 1; i++) {
            deck.add(new Card());
        }

        for (int i = 0; i < 8; i++) {
            deck.add(new Card());
        }

        for (int i = 0; i < 218; i++) {
            deck.add(new Card());
        }

        return deck;

    }

}
