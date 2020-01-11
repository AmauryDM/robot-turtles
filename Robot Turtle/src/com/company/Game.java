package com.company;

import java.util.ArrayList;

public class Game {

  public int numberPlayer;
  private int tour;
  private Tray tray;
  private ArrayList<Payer> players = new ArrayList<Player>();
  private ArrayList<Jewel> jewels = new ArrayList<Jewel>();

  public initializeGame(int numberPlayer) {
    this.numberPlayer = numberPlayer;
    this.tour = 0;

    for (int i = 1; i <= numberPlayer; i ++) {
      Player player = new Player();
      player.order = i;
      players.add(player);
    }

    if (numberPlayer == 2) {
      Jewel jewel = new Jewel("Joyau");
      jewels.add(jewel);
    }
    else if (numberPlayer == 3) {
      Jewel jewel1 = new Jewel("Joyau");
      jewels.add(jewel1);
      Jewel jewel2 = new Jewel("Joyau");
      jewels.add(jewel2);
      Jewel jewel3 = new Jewel("Joyau");
      jewels.add(jewel3);
    }
    else if (numberPlayer == 4) {
      Jewel jewel1 = new Jewel("Joyau");
      jewels.add(jewel1);
      Jewel jewel2 = new Jewel("Joyau");
      jewels.add(jewel2);
    }

    this.tray = new Tray(players, jewels);
  }

  public void startGame() {
    tray.initializeTray(tray, numberPlayer);

    do {
      if (tour == numberPlayer){
        tour = 0;
      }

      Player currentPlayer = players.get(tour);
      int orderPlayer += 1;
      tour += 1
    } while (nombrePlayers != 1);
  }

}
