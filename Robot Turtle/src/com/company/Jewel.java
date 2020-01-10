package com.company;

public class Jewel extends Turtle {

    String direction;
    int position;

    public static void getJewel() {
        Jewel jewel = new Jewel();
        System.out.println(jewel.direction);
        System.out.println(jewel.position);
    }
}
