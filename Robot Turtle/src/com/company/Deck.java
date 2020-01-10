package com.company;

import java.util.*;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();
    private ArrayList<Wall> walls = new ArrayList<Card>();

    public Deck() {
    }

    public ArrayList<Card> createDeck() {
        for (int i = 0; i < 18; i++) {
            deck.add(new BlueCard());
        }

        for (int i = 0; i < 1; i++) {
            deck.add(new YellowCard());
        }

        for (int i = 0; i < 8; i++) {
            deck.add(new LaserCard());
        }

        for (int i = 0; i < 218; i++) {
            deck.add(new Card());
        }

        Collections.shuffle(deck);
        return deck;
    }

    public ArrayList<Wall> createWalls() {
      for(int i = 0; i < 20; i++) {
        walls.add(new StoneWall());
      }

      for(int i = 0; i < 12; i++) {
        walls.add(new IceWall());
      }
    }

}
