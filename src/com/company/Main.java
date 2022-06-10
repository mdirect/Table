package com.company;

import com.sun.tools.attach.VirtualMachine;

import javax.management.ConstructorParameters;
import java.lang.annotation.AnnotationFormatError;

public class Main {
    public static void main(String[] args) {
        try {
            Table bad = new Table(-4);
        }
        catch(ArithmeticException x) {
            System.out.println("Ошибка в следующем:");
            x.printStackTrace();
            System.out.println("Нельзя!");
        }

        System.out.println("\n\nНаследование\n");

        TableWithSeparator one = new TableWithSeparator(5);
        TableWithSeparator two = new TableWithSeparator(4, 80, (float)120.0, (float)60.0, "дуб", "Германия");
        System.out.println("Количество ног у первого стола: " + one.get_count_legs());
        System.out.println("Высота второго " + two.get_high() + ". Материал столешницы " + two.get_tabletop_material());

        System.out.println("\n\n");
    }
}
