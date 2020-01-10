package com.company;

public class Walls {
    protected String name;
    protected String characteristic;
    protected String type;

    public String getName() {
        return this.name;
    }

    public String getCharacteristic() {
        return this.characteristic;
    }

    public boolean isDestroyable() {
        boolean destroyable = false;
        if (this.name.equals("IceWall")) {
            destroyable = true;
        }

        else if (this.name.equals("StoneWall")) {
            destroyable = false;
        }
        return destroyable;
    }
}

