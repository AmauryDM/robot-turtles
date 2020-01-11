package com.company;

import java.util.Scanner;

public class Card {

    public String type;
    protected String description; //Permettre d'être utilisée uniquement dans les sous-classes

    private Scanner scanner = new Scanner(System.in);

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public void actionCard(Tray tray, Player player, Jewel jewel) {
        if (this.type.equals("Bleu")) {
          player.currentCase(tray).empty();
          Case destination = player.destination(tray);
          Turtle destinationContent = destination.getContent()
          if(destination == null) {
            player.destination(direction);
          }
          else if (destinationContent instanceof Jewel) {
            System.out.println("Joyau atteint");
            jewel.winPlayer();
            Case jewelCase = tray.place(jewel.getJewel()[0], jewel.getJewel()[1]);
            jewelCase.empty();
          }
          else if (destinationContent instanceof Player) {
              System.out.println("Collision, retour à la case départ");
              Case startCasePlayer = tray.positionCase(player.getStartCoordinate()[0], player.getStartCoordinate[1]);
              Case startCaseDestination = tray.positionCase(destinationContent.getStartCoordinate()[0], destinationContent.getStartCoordinate()[1]);
              destination.empty();
              startCasePlayer.place(tray, player);
              startCaseDestination.place(tray, player);
          }
          else if (destinationContent.empty()) {
            destinationContent.placeTurtle(tray, player);
          }
        }

        if (this.type.equals("Jaune")) {
          if(direction = "N") {
            direction = "W";
          }
          else if(direction = "W") {
            direction = "S";
          }
          else if(direction = "S") {
            direction = "E";
          }
          else if(direction = "E") {
            direction = "N";
          }

        if (thsi.type.equals("Violet")) {
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

        if (this.type.equals("Laser")) {
          for (Case front : player.frontCase(tray)) {
            if (!front.emptyCase()) {
              Turtle frontContent = front.getContent();
              if (frontContent instanceof Wall) {
                System.out.println("Mur touché");
                if ((Wall) frontContent.isDestroyable()){
                  front.empty();
                }
                break;
              }
              if (frontContent instanceof Jewel) {
                System.out.println("Joyau touché");
                if (number == 2) {
                  System.out.println("Demi-tour");
                  if(direction = "N") {
                    direction = "S";
                  }
                  else if(direction = "E") {
                    direction = "W";
                  }
                  else if(direction = "S") {
                    direction = "N";
                  }
                  else if(direction = "W") {
                    direction = "E";
                  }
                }
                else {
                  System.out.println("Retour case départ");
                  Case startCase = tray.positionCase(player.getStartCoordinate()[0], player.getStartCoordinate()[1]);
                  player.currentCase(tray).empty();
                  startCase.placeTurtle(tray, player);
                }
                break;
              }
            }
          }
        }
        }
    }
}
