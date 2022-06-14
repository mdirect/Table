package com.company;

import com.sun.tools.attach.VirtualMachine;
import javax.management.ConstructorParameters;
import java.lang.annotation.AnnotationFormatError;

public class Main {
    public static void main(String[] args) throws Errors {
        /*
        +1. У стола массив из ног
        +2. Класс Legs -> Leg
        +3. Отдельный класс "ошибок":
                class Error extends Exception {
                    //реализовать для ног
                }
        +4. Инициализация Стола: Table(Legs legs, Tabletop tabletop)
        +5. Добавить всем классам "вес".
        +6. Составить стол из объектов других классов
        +7. Вычислить вес у стола из составляющих
        +8. Создать класс Separator и добавить его как объект к классу наследнику от класс Table - TableWithSeparator"
        9. Переназначить функцию вычисления веса для стола с разделителем.
        +10. Прописать всем числовым значениям Exception из числа класса Ошибок
        +11. Почитать про интерфейс и сделать Столу интерфейс
        +12. Не упустить обработку ошибок у класса и наследника
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
