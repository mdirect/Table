package com.company.example_encapsulation;

import java.sql.SQLOutput;

public class Culculator {
    private int data;

    void setData(int data) {
        if (data < 0) {
            System.out.println("Бабушка, не шали!");
        } else {
            this.data = data;
        }
    }

    void sqrt() {
        System.out.println(Math.sqrt(data));
    }
}
