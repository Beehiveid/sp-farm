package com.nanda.core.livestock;

public enum LivestockType {
    COW(1, "Cow", true),
    GOAT(2, "Goat", true),
    SHEEP(3, "Sheep", true),
    CHICKEN(4, "Chicken", false),
    DUCK(5, "Duck", false),
    FISH(6, "Fish", false);

    private int id;
    private String name;
    private boolean big;

    LivestockType(int id, String name, boolean big) {
        this.id = id;
        this.name = name;
        this.big = big;
    }

    public static LivestockType get(int id){
        for (LivestockType value : LivestockType.values()) {
            if(value.getId() == id)
                return value;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isBig() {
        return big;
    }
}
