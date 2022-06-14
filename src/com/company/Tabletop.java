package com.company;

public class Tabletop {
    private int     lenght;
    private int     widht;
    protected float weight;
    private String  material;

    public Tabletop(int lenght, int widht, float weight, String material) throws Errors{
        setWidht(widht);
        setLenght(lenght);
        setWeight(weight);
        setMaterial(material);
    }

    public void setWidht(int widht) throws Errors{
        if (widht <= 1) {
            throw new Errors("Внимание! Неккоректная ширина столешницы!");
        }
        this.widht = widht;
    }

    public void setWeight(float weight) throws Errors{
        if (weight <= 0) {
            throw new Errors("Внимание! Неккоректный вес столешницы!");
        }
        this.weight = weight;
    }

    public void setLenght(int lenght) throws Errors{
        if (lenght <= 1) {
            throw new Errors("Внимание! Неккоректная длинна столешницы!");
        }
        this.lenght = lenght;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    int getWidht() {
        return widht;
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
