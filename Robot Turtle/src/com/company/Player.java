package com.company;

import java.util.*;

public class Player extends Turtle{

  public int number;
  private String color;
  private String direction;
  private int position;

  public ArrayList<Card> playerDeck = new ArrayList<Card>;
  public ArrayList<Wall> playerWalls = new ArrayList<Wall>;
  public ArrayList<Card> discard = new ArrayList<Card>;

  public ArrayList<Card> program = new ArrayList<Card>;

  public Player(String name, String color) {
    this.name = name;
    this.color = color;
    this.direction = "N";

    Deck initializeDeck = new Deck();
    this.deck = initializeDeck.createDeck();
    this.walls = initializeDeck.createWalls();

    for (int i = 0; i < 5; i++) {
      playerDeck.add(deck.get(0));
      deck.remove(0);
    }
  }

  public void displayProgram() {
    if (!program.isEmpty()) {
      for (Card card : program) {
        System.out.println(card.getName());
      }
    }
    else {
      System.out.println("Le programme est vide");
    }
  }

  public void turn(String direction) {
    if(direction = "N") {
      direction = "E";
    }
    else if(direction = "E") {
      direction = "S";
    }
    else if(direction = "S") {
      direction = "W";
    }
    else if(direction = "W") {
      direction = "N";
    }
  }

  public Case destination(Tray tray) {
    Case destination = new Case(0, 0);

    if (direction == "N") {
      destination = tray.positionCase(x+1, y);
    }

    if (direction == "S") {
      destination = tray.positionCase(x, y-1);
    }

    if (direction == "E") {
      destination = tray.positionCase(x, y+1);
    }

    if (direction == "W") {
      destination = tray.positionCase(x-1, y);
    }

    return destination;
  }
}
