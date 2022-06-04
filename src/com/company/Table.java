package com.company;

public class Table {
    private int     count_legs;
    private int     high;
    private float   lenght;
    private float   widht;
    private String  made_in;
    private String  legs_material;
    private String  tabletop_material;
    private String  tabletop_colour;

    /*  Задание:
        1. Пример инкапсуляции
        2. Модификаторы доступа
        3. Ключевые слова (static, final ...)
        4. Запретить дефолт Table()
        5. Защита от кривого стола
     */


    Table(int count_legs_set,
          String tabletop_material_set) {
        count_legs = count_legs_set;
        tabletop_material = tabletop_material_set;
    }

    Table(int count_legs_set,
          String tabletop_material_set,
          String made_in_set) {
        count_legs = count_legs_set;
        tabletop_material = tabletop_material_set;
        made_in = made_in_set;
    }

    Table(int count_legs_set,
          int high_set,
          int lenght_set,
          int widht_set,
          String tabletop_material_set,
          String made_in_set) {
        count_legs = count_legs_set;
        high = high_set;
        lenght = lenght_set;
        widht = widht_set;
        tabletop_material = tabletop_material_set;
        made_in = made_in_set;
    }

    Table(int count_legs_set,
          int high_set,
          int lenght_set,
          int widht_set,
          String tabletop_material_set,
          String legs_material_set,
          String tabletop_colour_set,
          String made_in_set) {
        count_legs = count_legs_set;
        high = high_set;
        lenght = lenght_set;
        widht = widht_set;
        tabletop_material = tabletop_material_set;
        tabletop_colour = tabletop_colour_set;
        legs_material = legs_material_set;
        made_in = made_in_set;
    }

    int get_count_legs() {
        return count_legs;
    }

    int get_high() {
        return high;
    }

    float get_lenght() {
        return lenght;
    }

    float get_widht() {
        return widht;
    }

    String get_made_in() {
        return made_in;
    }

    String get_tabletop_material() {
        return tabletop_material;
    }

    String get_legs_material() {
        return legs_material;
    }

    String get_tabletop_colour() {
        return tabletop_colour;
    }

    void change_tabletop_colour(String new_colour) {
        tabletop_colour = new_colour;
        made_in = "hand-made";
    }

    void change_tabletop(String new_material) {
        tabletop_material = new_material;
        made_in = "hand-made";
    }

    void change_legs(int new_count_legs, String new_legs_material) {
        count_legs = new_count_legs;
        legs_material = new_legs_material;
        made_in = "hand-made";
    }
}
