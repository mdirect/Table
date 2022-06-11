package com.company;

public class Legs {
    private int     count_legs;
    private int     high;
    private String  legs_material;

    public void set_count_legs(int count_legs) {
        if (count_legs <= 1) {
            throw new ArithmeticException("Внимание! Количество ножек меньше, чем один!");
        }
        this.count_legs = count_legs;
    }

    public void set_high(int high) {
        if (high <= 1) {
            throw new ArithmeticException("Внимание! Высота меньше, чем один!");
        }
        this.high = high;
    }

    public void set_legs_material(String legs_material) {
        this.legs_material = legs_material;
    }

    void change_legs(int new_count_legs, String new_legs_material) {
        set_count_legs(new_count_legs);
        legs_material = new_legs_material;
    }

    int get_count_legs() {
        return count_legs;
    }

    int get_high() {
        return high;
    }

    String get_legs_material() {
        return legs_material;
    }
}
