package com.company;

public class StoneWall extends Wall {

    public String getCharacteristic() {
        return this.characteristic;
    }

    protected boolean isDestroyable;

    public boolean getIsDestroyable() {
        return this.isDestroyable;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type="Mur";
    }
}
