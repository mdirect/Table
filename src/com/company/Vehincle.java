package com.company;

import org.jetbrains.annotations.NotNull;

public class Vehincle {
    private float maxWeight;
    private Table[] tables;

    Vehincle(float maxWeight) throws NotPositiveValue {
        setMaxWeight(maxWeight);
    }

    public void setMaxWeight(float maxWeight) throws NotPositiveValue {
        if (maxWeight <= 0) {
            throw new NotPositiveValue("Внимание! Грузоподъемность машины должна быть положительным числом!");
        }
        this.maxWeight = maxWeight;
    }

    float getMaxWeight() {
        return maxWeight;
    }

    public void loadTables(Table[] tables) throws BigWeight {
//        if (tables == null)
//            throw new Exception();

        float weight = 0;

        for (Table table: tables) {
            weight += table.getWeight();
            if (weight > maxWeight)
                throw new BigWeight("Осторожно! Вы пытаетесь загрузить в машину слишком большой вес!");
        }
        this.tables = tables;
    }

    public float getWeightTables() {
        float weight = 0;

        if (tables != null)
            for (Table table: tables)
                weight += table.getWeight();
        return weight;
    }

    public float getFreeWeight() {
        return maxWeight - this.getWeightTables();
    }
}
