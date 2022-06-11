package com.company.example_exceptions;

public class C {
    void doWorks() throws A {
        if (true)
            throw new A();
    }

    void doWorks2() throws B{
        if (true)
            throw new B();
    }
}
