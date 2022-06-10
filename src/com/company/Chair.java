package com.company;

public class Chair {
    private int     count_legs;
    private int     high;
    private String  made_in;
    private String  legs_material;
    private String  colour;

    Chair(int count_legs) {
        set_count_legs(count_legs);
    }

    public void set_count_legs(int count_legs) {
        this.count_legs = count_legs < 1 ? 1 : count_legs;
    }

    int get_count_legs() {
        return count_legs;
    }

    int get_high() {
        return high;
    }

    String get_made_in() {
        return made_in;
    }

    String get_legs_material() {
        return legs_material;
    }

    String get_colour() {
        return colour;
    }
}
