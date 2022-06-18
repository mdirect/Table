package com.company;

public class Separator {
    private int     high;
    private int     lenght;
    private float   weight;
    private String  material;

    public Separator(int high, int lenght, float weight, String material) throws NotPositiveValue {
        setHigh(high);
        setLenght(lenght);
        setWeight(weight);
        setMaterial(material);
    }

    public void setHigh(int high) throws NotPositiveValue {
        if (high <= 1) {
            throw new NotPositiveValue("Внимание! Неккоректная высота разделителя!");
        }
        this.high = high;
    }

    public void setWeight(float weight) throws NotPositiveValue {
        if (weight <= 0) {
            throw new NotPositiveValue("Внимание! Неккоректный вес разделителя!");
        }
        this.weight = weight;
    }

    public void setLenght(int lenght) throws NotPositiveValue {
        if (lenght <= 1) {
            throw new NotPositiveValue("Внимание! Неккоректная длинна разделителя!");
        }
        this.lenght = lenght;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    int getHigh() {
        return high;
    }

    int getLenght() {
        return lenght;
    }

    float getWeight() {
        return weight;
    }

    String getMterial() {
        return material;
    }
}
