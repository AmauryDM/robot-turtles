package com.company;

public class Jewel extends Turtle {

  private String name;

  public Jewel () {
    this.name = name;
    this.direction = "Joyau";
  }

    public static void getJewel() {
        Jewel jewel = new Jewel();
        System.out.println(jewel.direction);
        System.out.println(jewel.position);
    }
}
