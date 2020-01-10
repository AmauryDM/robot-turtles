package com.company;
import java.util.*;

public class Tray {

    private ArrayList<Player> players;
    private ArrayList<Jewel> jewels;

    private Case[][] tray = new Case[8][8];

    public Tray(ArrayList<Player> players, ArrayList<Jewel> jewels) {
        this.players = players;
        this.jewels = jewels;
    }

    public Case position(int xCoordinate, int yCoordinate){
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
            joueurs.get(1).setStartCoordinate(new int[] {0,5});
            [0][1].placeTurtle(instancePlateau, joueurs.get(0));
            plateau[0][5].placeTurtle(instancePlateau, joueurs.get(1));
            plateau[7][3].placeTurtle(instancePlateau, joyaux.get(0));
        }

        else if (nombreJoueurs == 3) {
            joueurs.get(0).setPositionDepart(new int[] {0,0});
            joueurs.get(1).setPositionDepart(new int[] {0,3});
            joueurs.get(2).setPositionDepart(new int[] {0,6});
            plateau[0][0].poser(instancePlateau, joueurs.get(0));
            plateau[0][3].poser(instancePlateau, joueurs.get(1));
            plateau[0][6].poser(instancePlateau, joueurs.get(2));
            plateau[7][0].poser(instancePlateau, joyaux.get(0));
            plateau[7][3].poser(instancePlateau, joyaux.get(1));
            plateau[7][6].poser(instancePlateau, joyaux.get(2));
        }

        else if (nombreJoueurs == 4) {
            joueurs.get(0).setPositionDepart(new int[] {0,0});
            joueurs.get(1).setPositionDepart(new int[] {0,2});
            joueurs.get(2).setPositionDepart(new int[] {0,5});
            joueurs.get(3).setPositionDepart(new int[] {0,7});
            plateau[0][0].poser(instancePlateau, joueurs.get(0));
            plateau[0][2].poser(instancePlateau, joueurs.get(1));
            plateau[0][5].poser(instancePlateau, joueurs.get(2));
            plateau[0][7].poser(instancePlateau, joueurs.get(3));
            plateau[7][1].poser(instancePlateau, joyaux.get(0));
            plateau[7][6].poser(instancePlateau, joyaux.get(1));
        }
    }

}
