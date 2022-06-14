package com.company;

public class TableWithSeparator extends Table implements TableInterface{
    private Separator   separator;

    TableWithSeparator(Leg[] leg, Tabletop tabletop, Separator separator) {
        super(leg, tabletop);
        this.separator = separator;
    }

//    private void setWeight() {
//        this.getWeight() = super.getWeight() + separator.getWeight();
////        for (int i = 0; i < getCountLegs(); i++)
////            this.weight += leg[i].getWeight();
////        this.weight += this.tabletop.getWidht();
//    }

}
