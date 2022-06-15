package com.company;

import com.sun.tools.attach.VirtualMachine;
import javax.management.ConstructorParameters;
import java.lang.annotation.AnnotationFormatError;

public class Main {
    public static void main(String[] args) throws Errors {
        /*
        1. Прописать геттеры и сеттеры для ног, столешницы и разделителя в классах стола
        2. Прописать интерфейс пересчета веса для разных столов
        3. Назвать класс ошибок более конкретно (NotPositiveValue)
        4. Почитать про диспетчеризация типов
         */

        System.out.println("Task 3");
        Leg[]               leg = new Leg[4];
        Tabletop            tabletop;
        Table               table;
        Leg[]               leg2 = new Leg[3];
        Tabletop            tabletop2;
        Separator           separator;
        TableWithSeparator  tablewithseparator;


        for (int i = 0; i < 4; i++)
            leg[i] = new Leg(70, 0.7F, "сталь");
        tabletop = new Tabletop(80, 80, 3, "стекло");
        table = new Table(leg, tabletop);

        for (int i = 0; i < 3; i++)
            leg2[i] = new Leg(80, 0.5F, "дерево");
        tabletop2 = new Tabletop(120, 60, 2, "дерево");
        separator = new Separator(50, 120, 0.2F, "пластик");
        tablewithseparator = new TableWithSeparator(leg2, tabletop2, separator);

    }
}
