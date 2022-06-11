package com.company;

import com.sun.tools.attach.VirtualMachine;
import javax.management.ConstructorParameters;
import java.lang.annotation.AnnotationFormatError;

public class Main {
    public static void main(String[] args) {
        /*
        1. У стола массив из ног
        2. Класс Legs -> Leg
        3. Отдельный класс "ошибок":
                class Error extends Exception {
                    //реализовать для ног
                }
        4. Инициализация Стола: Table(Legs legs, Tabletop tabletop)
        5. Добавить всем классам "вес".
        6. Составить стол из объектов других классов
        7. Вычислить вес у стола из состовляющих
        8. Создать класс Separator и добавить его как объект к классу наследнику от класс Table - TableWithSeparator"
        9. Переназначить функцию вычисления веса для стола с разделителем.
        10. Прописать всем числовым значениям Exception из числа класса Ошибок
        11. Почитать про интерфейс и сделать Столу интерфейс
        12. Не упустить обработку ошибок у класса и наследника
         */
        System.out.println("Task 3");
    }
}
