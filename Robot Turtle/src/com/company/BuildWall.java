package com.company;

import java.util.*;

public class BuildWall extends Tour {

  public void buildWall() {
    Scanner scanner = new Scanner(System.in);
    int inputType;
    int inputX;
    int inputY;
    boolean availability = false;

    do{
      do{
        System.out.println("Entrez 1 pour un mur de pierre");
        System.out.println("Entrez 2 pour un mur de glace");
        inputType = scannner.nextInt();
      } while(inputType > 2 || inputType < 1);

      if (inputType == 1 && (walls.get(0).getName().equals("Pierre"))) {
        availability = true;
      }
      else if (inputType == 2 && (walls.get(walls.size() - 1).getName().equals("Glace"))) {
        availability = true;
      }
    } while(!availability);

    do{
      System.out.println("Entrez le numéro de la ligne entre 1 et 8");
      inputX = scanner.nextInt();
      System.out.println("Entrez le numéro de la colonne entre 1 et 8");
      inputY = scanner.nextInt();
    } while(inputX<8 || inputX>1 || inputY<1 || inputY>8 || !tray.positionCase(inputX-1, inputY-1).emptyCase());

    if (inputType == 1) {
      StoneWall stoneWall = walls.get(0);
      walls.remove(0);
      tray.positionCase(inputX-1, inputY-1).place(tray, stoneWall);
    }
    else if (inputType == 2) {
      Walls iceWall =  walls.get(walls.size() - 1);
      walls.remove(walls.size() - 1);
      tray.positionCase(inputX-1, inputY-1);.place(tray, iceWall);
    }
  }
}
