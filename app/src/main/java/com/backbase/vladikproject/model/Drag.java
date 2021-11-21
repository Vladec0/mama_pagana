package com.backbase.vladikproject.model;

public class Drag extends Product {

    private boolean isNarckotick;

    public Drag(int id, String name, int price) {
        super(id, name, price);
        this.isNarckotick = false;
    }

    public void setNarckotick(boolean isNarckotick){
        this.isNarckotick = isNarckotick;
    }

    public boolean getNarckotick() {
        return isNarckotick;
    }
}
