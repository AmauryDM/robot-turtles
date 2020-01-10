package com.company;

public class Case {

  private int xCoordinate;
  private int yCoordinate;
  private Turtle content;

  public Case(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int[] getPosition(){
    int[] position = {this.x, this.y};
    return position;
  }

  public void empty(){
    this.content = null;
  }

  public Turtle contentEmpty() {
    if(content == null){
      Turtle turtle = new Turtle();
      turtle.getType(" ");
      return turtle
    }
    return content;
  }

  public boolean emptyCase() {
        if (contenu == null) {
          return true;
        }
        else {
            System.out.println("La case (" + this.getPosition()[0] + "," + this.getPosition()[1] + ") n'est pas vide !");
            return false;
        }
    }

    public void placeTurtle(Tray tray, Turtle turtle) {
        turtle.placeTurtle(this.x, this.y);
        this.contenu = turtle;
    }
}
