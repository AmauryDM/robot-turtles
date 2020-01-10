package com.company;

import java.util.Scanner;

public class Card {

    public String type;
    protected String description; //Permettre d'être utilisée uniquement dans les sous-classes

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public void actionCard(Tray tray, Player player) {

        if (this.type.equals("Carte bleue")) {
        }

    }

    public static  Scanner scanner = new Scanner(System.in);

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
