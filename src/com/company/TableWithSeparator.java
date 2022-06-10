package com.company;

public class TableWithSeparator extends Table{
    private boolean separator = true;
    private String  model_separator;
    int weight_separator; // взвесить стол со всеми предметами

//    Table(Legs legs, Tabletop tabletop)

    int set_weight(){
        return weight;
    }

    TableWithSeparator(int count_legs) {
        super(count_legs);
    }

    TableWithSeparator(int count_legs, int high, float lenght, float wight, String tabletop_material, String made_in) {
        super(count_legs, high, lenght, wight, tabletop_material, made_in);
    }

    public String getModel_separator() {
        return model_separator;
    }

    public boolean getSeparator() {
        return separator;
    }
}

// интерфейс
