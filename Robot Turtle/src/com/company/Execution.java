package com.company;

public class Execution extends Tour {

    public static void executeProgram(Tray tray, Player player) {
      if (!program.isEmpty()) {
        for (Card card : program) {
          card.actionCard(tray, player);
        }
        program.clear();
      }
      else {
        System.out.println("Le programme est vide");
      }
    }
}
