package com.company.example_exceptions;

import com.company.example_exceptions.A;
import com.company.example_exceptions.B;
import com.company.example_exceptions.C;

public class Main_ab {
    public static void main(String[] args) {
        C c = new C();
        try {
            c.doWorks();
        } catch (A e) {
            System.out.println("Catch error");
        }
        try {
            c.doWorks2();
        } catch (B e) {
            System.out.println("Catch error2");
        }
        finally {
            System.out.println("Final");
        }
    }
}
