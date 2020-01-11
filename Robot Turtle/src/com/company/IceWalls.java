package com.company;

public class IceWall extends Wall {

    public String getCharacteristic() {
        return this.characteristic = "Mur destructible";
    }

    public boolean getIsDestroyable() {
        return this.isDestroyable;
    }

    public String getName() {
        return this.name="Glace";
    }

    public String getType() {
        return this.type="Mur";
    }
}
