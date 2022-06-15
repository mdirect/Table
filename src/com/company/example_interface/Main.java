package com.company.example_interface;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.contract();
        b.contract();
        Super sa = new A();
        Super sb = new B();

        Super[] arraySuper = {sa, sb};
        for (Super i: arraySuper) {
            i.contract();
        }
    }
}
