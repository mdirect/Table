package com.company;

public class Tabletop {
    private float   lenght;
    private float   widht;
    private String  tabletop_material;
    private String  tabletop_colour;

    public void set_lenght(float lenght) {
        if (lenght <= 1) {
            throw new ArithmeticException("Внимание! Длина меньше, чем один!");
        }
        this.lenght = lenght;
    }

    public void set_widht(float widht) {
        if (widht <= 1) {
            throw new ArithmeticException("Внимание! Ширина меньше, чем один!");
        }
        this.widht = widht;
    }

    public void set_tabletop_material(String tabletop_material) {
        this.tabletop_material = tabletop_material;
    }

    public void set_tabletop_colour(String tabletop_colour) {
        this.tabletop_colour = tabletop_colour;
    }

    void change_tabletop(float new_lenght, float new_widht, String new_tabletop_material, String new_tabletop_colour) {
        set_tabletop_material(new_tabletop_material);
        set_tabletop_colour(new_tabletop_colour);
        set_lenght(new_lenght);
        set_widht(new_widht);
    }

    public float get_lenght() {
        return lenght;
    }

    public float get_widht() {
        return widht;
    }

    public String get_tabletop_material() {
        return tabletop_material;
    }

    public String get_tabletop_colour() {
        return tabletop_colour;
    }
}
