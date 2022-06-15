package com.company;

public class Separator {
    private int     high;
    private int     lenght;
    private float   weight;
    private String  material;

    public Separator(int high, int lenght, float weight, String material) throws Errors{
        setHigh(high);
        setLenght(lenght);
        setWeight(weight);
        setMaterial(material);
    }

    public void setHigh(int high) throws Errors{
        if (high <= 1) {
            throw new Errors("Внимание! Неккоректная высота разделителя!");
        }
        this.high = high;
    }

    public void setWeight(float weight) throws Errors{
        if (weight <= 0) {
            throw new Errors("Внимание! Неккоректный вес разделителя!");
        }
        this.weight = weight;
    }

    public void setLenght(int lenght) throws Errors{
        if (lenght <= 1) {
            throw new Errors("Внимание! Неккоректная длинна разделителя!");
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
