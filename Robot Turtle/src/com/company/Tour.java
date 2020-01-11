package com.company;

public class Tour {

  public void endTour() {
      Scanner scanner = new Scanner(System.in);
      boolean run = true;
      int input;
      int numberDiscard = 0;

      System.out.println("FIN DU TOUR");
      this.getDeck();
      System.out.println("1. Se débarrasser de certaines cartes");
      System.out.println("2. Terminer son tour");

      input = scanner.nextInt();

      if (input == 1) {
          do {
              System.out.println("De quelle carte se défausser ?");
              System.out.println("(0 pour terminer la saisie)");
              input = scanner.nextInt();

              if (input < 0 || input > main.size()) {
                  System.out.println("Erreur dans la saisie");
              }

              else if (saisie == 0) {
                  run = false;
              }

              else {
                  Card chosen = main.get(saisie - 1);
                  playerDeck.remove(chosen);
                  numberDiscard += 1;
                  this.getDeck();
              }
          } while (run);

          while (playerDeck.size() < 5) {
              playerDeck.add(deck.get(0));
              deck.remove(0);
          }
      }
      else (input == 2) {
        number += 1;
      }
  }
}
