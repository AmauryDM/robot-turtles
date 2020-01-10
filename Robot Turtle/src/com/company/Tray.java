package com.company;
import java.util.*;

public class Tray {

    private ArrayList<Player> players;
    private ArrayList<Jewel> jewels;

    private Case[][] tray = new Case[8][8];

    public Tray(ArrayList<Player> players, ArrayList<Jewel> jewels) {
        this.players = players;
        this.jewels = jewels;
    }



}
