package com.company;

public class Jewel extends Turtle {
    private String color;

    String direction;
    int position;

    public static void getJewel() {
        Jewel jewel = new Jewel();
        System.out.println(jewel.direction);
        System.out.println(jewel.position);
    }

    public String ShowColor() {
        return this.color;
    }
}
