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

    public void actionCard(Tray tray, Player player) {
        if (this.type.equals("Bleu")) {
          player.currentCase(tray).empty();
          Case destination = player.destination(tray);
          Turtle targetContent = destination.getContent()
          if(destination == null)
        }

    }

    public static void actionCard() {
        System.out.println("Saisir une carte");
        String saisieCarte = scanner.nextLine();
        if (saisieCarte.equals("Mur")) {
            System.out.println("Saisir la ligne d'emplacement du mur");
            int xMur = scanner.nextInt();
            System.out.println("Saisir la colonne d'emplacement du mur");
            int yMur = scanner.nextInt();
        }
        else if (saisieCarte.equals("Bleu")) {
            //Fonction qui fait avancer d'une case en fonction de l'orientation
        }
    }
}
