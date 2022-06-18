package com.company;

public class Table implements CalculateWeight {
    private Leg[]       legs;
    private Tabletop    tabletop;
    private float       weight;

    Table(Leg[] legs, Tabletop tabletop) {
        this.tabletop = tabletop;
        this.legs = legs;
        this.weight = calculateWeight();
    }

    public float calculateWeight() {
        float weight = 0;
        for (Leg leg: this.legs)
            weight += leg.getWeight();
        weight += this.tabletop.getWeight();
        return weight;
    }

    public float getWeight() {
        return weight;
    }

    public Leg[] getLegs() {
        return legs;
    }

    public Tabletop getTabletop() {
        return tabletop;
    }

}
