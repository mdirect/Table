package com.company;

public class Table {
    private Legs        legs;
    private Tabletop    tabletop;
    private String      made_in;
    int weight;

//    Table(Legs legs, Tabletop tabletop)

    int set_weight(){
        return weight;
    }

    Table(int count_legs) {
        this.legs = new Legs();

        this.legs.set_count_legs(count_legs);
    }

    Table(int count_legs, int high) {
        this.legs = new Legs();

        this.legs.set_count_legs(count_legs);
        this.legs.set_high(high);
    }

    Table(int count_legs, int high, float lenght, float wight, String tabletop_material) {
        this.legs = new Legs();
        this.tabletop = new Tabletop();

        this.legs.set_count_legs(count_legs);
        this.legs.set_high(high);
        this.tabletop.set_lenght(lenght);
        this.tabletop.set_widht(wight);
        this.tabletop.set_tabletop_material(tabletop_material);
    }

    Table(int count_legs, int high, float lenght, float wight, String tabletop_material, String made_in) {
        this.legs = new Legs();
        this.tabletop = new Tabletop();

        this.legs.set_count_legs(count_legs);
        this.legs.set_high(high);
        this.tabletop.set_lenght(lenght);
        this.tabletop.set_widht(wight);
        this.tabletop.set_tabletop_material(tabletop_material);
        this.made_in = made_in;
    }

    String get_made_in() {
        return made_in;
    }

    void change_legs(int new_count_legs, String new_legs_material) {
        legs.change_legs(new_count_legs, new_legs_material);
        made_in = "hand-made";
    }

    void change_tabletop(float new_lenght, float new_widht, String new_tabletop_material, String new_tabletop_colour) {
        tabletop.change_tabletop(new_lenght, new_widht, new_tabletop_material, new_tabletop_colour);
        made_in = "hand-made";
    }

    int get_count_legs() {
        return legs.get_count_legs();
    }

    int get_high() {
        return legs.get_high();
    }

    String get_legs_material() {
        return legs.get_legs_material();
    }

    public float get_lenght() {
        return tabletop.get_lenght();
    }

    public float get_widht() {
        return tabletop.get_widht();
    }

    public String get_tabletop_material() {
        return tabletop.get_tabletop_material();
    }

    public String get_tabletop_colour() {
        return tabletop.get_tabletop_colour();
    }
}
