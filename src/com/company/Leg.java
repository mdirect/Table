package com.company;

public class Leg {
    private int     high;
    private float   weight;
    private String  material;

    public Leg(int high, float weight, String material) throws NotPositiveValue {
        setHigh(high);
        setWeight(weight);
        setMaterial(material);
    }

    public void setHigh(int high) throws NotPositiveValue {
        if (high <= 1) {
            throw new NotPositiveValue("Внимание! Неккоректная высота ножки!");
        }
        this.high = high;
    }

    public void setWeight(float weight) throws NotPositiveValue {
        if (weight <= 0) {
            throw new NotPositiveValue("Внимание! Неккоректный вес ножки!");
        }
        this.weight = weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    int getHigh() {
        return high;
    }

    float getWeight() {
        return weight;
    }

    String getMterial() {
        return material;
    }
}
