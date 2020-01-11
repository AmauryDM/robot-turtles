package com.company;

public class Jewel extends Turtle {

  private String name;
  private Turtle turtle;

  public Jewel () {
    this.name = name;
    this.direction = "Joyau";
  }

    public static void getJewel() {
        Jewel jewel = new Jewel();
        System.out.println(jewel.direction);
        System.out.println(jewel.position);
    }

    public void winPlayer() {
      if (number == 2) {
        if (turtle.getCoordinate(0) == 7 && turtle.getCoordinate(1) == 3) {
          System.out.println("Vous avez gagné");
          turtle.empty();
        }
      }
      else if (number == 3) {
        if ((turtle.getCoordinate(0) == 7 && turtle.getCoordinate(1) == 0) || (turtle.getCoordinate(0) == 7 && turtle.getCoordinate(1) == 3) || (turtle.getCoordinate(0) == 7 && turtle.getCoordinate(1) == 6))
        System.out.println("Vous avez gagné");
        turtle.empty();
      }
      else if (number == 4) {
        if ((turtle.getCoordinate(0) == 7 && turtle.getCoordinate(1) == 1) || (turtle.getCoordinate(0) == 7 && turtle.getCoordinate(1) == 6)) {
          System.out.println("Vous avez gagné");
          turtle.empty();
        }
      }
    }
}
