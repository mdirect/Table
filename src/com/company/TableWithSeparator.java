package com.company;

public class TableWithSeparator extends Table implements CalculateWeight {
    private Separator   separator;
    private float       weight;

    TableWithSeparator(Leg[] legs, Tabletop tabletop, Separator separator) {
        super(legs, tabletop);
        this.separator = separator;
        this.weight = super.getWeight() + this.separator.getWeight();
    }

    public Separator getSeparator() {
        return separator;
    }

    public float getWeight() {
        return weight;
    }
}

