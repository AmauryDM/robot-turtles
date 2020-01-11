package com.company;

public class StoneWall extends Wall {

  public String getCharacteristic() {
      return this.characteristic = "Mur indestructible";
  }

  public boolean getIsDestroyable() {
      return this.isDestroyable;
  }

  public String getName() {
      return this.name = "pierre";
  }

  public String getType() {
      return this.type = "Mur";
  }
}
