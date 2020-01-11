package com.company;
import java.util.*;

public class Tray {

    private ArrayList<Player> players;
    private ArrayList<Jewel> jewels;
    public int number;

    private Case[][] tray = new Case[8][8];

    public Tray(ArrayList<Player> players, ArrayList<Jewel> jewels) {
        this.players = players;
        this.jewels = jewels;
    }

    public Case positionCase(int xCoordinate, int yCoordinate){
      try {
        return tray[xCoordinate][yCoordinate];
      }
      catch (java.lang.NullPointerException | java.lang.ArrayIndexOutOfBoundsException exception) {
        return null;
    }

    public void initializeTray(Tray initializeTray, int number) {
        for (int i = 0 ; i < 8 ; i++) {
            for (int j = 0 ; j < 8 ; j++) {
                tray[i][j] = new Case(i,j);
            }
        }

        if (number == 2) {
            players.get(0).setStartCoordinate(new int[] {0, 1});
            players.get(1).setStartCoordinate(new int[] {0,5});
            tray[0][1].place(initializeTray, players.get(0));
            tray[0][5].place(initializeTray, players.get(1));
            tray[7][3].place(initializeTray, jewels.get(0));
        }

        else if (number == 3) {
            players.get(0).setStartCoordinate(new int[] {0,0});
            players.get(1).setStartCoordinate(new int[] {0,3});
            players.get(2).setStartCoordinate(new int[] {0,6});
            tray[0][0].place(initializeTray, players.get(0));
            tray[0][3].place(initializeTray, players.get(1));
            tray[0][6].place(initializeTray, players.get(2));
            tray[7][0].place(initializeTray, jewels.get(0));
            tray[7][3].place(initializeTray, jewels.get(1));
            tray[7][6].place(initializeTray, jewels.get(2));
        }

        else if (number == 4) {
            players.get(0).setStartCoordinate(new int[] {0,0});
            players.get(1).setStartCoordinate(new int[] {0,2});
            players.get(2).setStartCoordinate(new int[] {0,5});
            players.get(3).setStartCoordinate(new int[] {0,7});
            tray[0][0].place(initializeTray, players.get(0));
            tray[0][2].place(initializeTray, players.get(1));
            tray[0][5].place(initializeTray, players.get(2));
            tray[0][7].place(initializeTray, players.get(3));
            tray[7][1].place(initializeTray, jewels.get(0));
            tray[7][6].place(initializeTray, jewels.get(1));
        }
    }
  }
}
