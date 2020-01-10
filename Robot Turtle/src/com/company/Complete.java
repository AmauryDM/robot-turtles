package com.company;

import java.util.*;

public class Complete extends Tour {

    public void completeProgram() {
      Scanner scanner = new Scanner(System.in);
      int input = new int;
      boolean continue = true;

        System.out.println("Voici votre deck :");
        this.getDeck();
        do {
          System.out.println("Quelle carte voulez-vous ajouter au programme ?");
          System.out.println("Entrez 0 pour arrêter la saisie");
          inputNumber = scanner.nextInt();

          if (inputNumber < 0 || inputNumber > deck.size()) {
              System.out.println("Erreur dans la saisie");
          }

          else if (inputNumber == 0) {
              continue = false;
          }

          else {
            Card choosen = playerDeck.get(input - 1);
            this.program.add(choosen);
            this.playerDeck.remove(choosen);
            this.getDeck();
          }
        } while(continue);
  }
}
