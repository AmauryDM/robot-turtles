package com.company;

public class Turtle {

    protected String direction;
    protected String name;
    protected int xCoordinate;
    protected int yCoordinate;
    protected int[] startCoordinate;

    public String getDirection() {
        if (this instanceof Player) {
            if (((Player) this).getDirection() == "N") {
                direction = "Haut";
            }
            if (((Player) this).getDirection() == "S") {
                direction = "Bas";
            }
            if (((Player) this).getDirection() == "E") {
                direction = "Droite";
            }
            if (((Player) this).getDirection() == "W") {
                direction = "Gauche";
            }
        }
        else if (this instanceof Jewel) {
            direction = "Joyaux";
        }
        return this.direction;
    }

    public String getType() {
        return this.type;
    }

    public int[] getStartCoordinate() {
        int[] startCoordinate = {this.xCoordinate, this.yCoordinate};
        return startCoordinate;
    }

    public int[] setStartCoordinate(){
      this.startCoordinate = startCoordinate;
    }

    public void place(int xCoordinate, int yCoordinate){
      this.xCoordinate = xCoordinate;
      this.yCoordinate = yCoordinate;
    }

    public Case currentCase(Tray tray){

    }

}
