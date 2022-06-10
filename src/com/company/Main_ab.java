package com.company;
// не упустить обработку ошибок у класса и наследника
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
