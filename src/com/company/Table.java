package com.company;

public class Table implements TableInterface{
    private Leg[]       leg;
    private Tabletop    tabletop;
    private float       weight;
    private int         countLegs;

    Table(Leg[] leg, Tabletop tabletop) {
        this.tabletop = tabletop;
        this.leg = leg;
        setWeight();
        setCountLegs();
    }

    private void setCountLegs() {
        this.countLegs = leg.length;
    }

    private void setWeight() {
        this.weight = 0;
        for (Leg l: this.leg)
            this.weight += l.getWeight();
        this.weight += this.tabletop.getWidht();
    }

    public int getCountLegs() {
        return countLegs;
    }

    public float getWeight() {
        return weight;
    }

}
