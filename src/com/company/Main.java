package com.company;

public class Main {
    public static void main(String[] args) throws NotPositiveValue, BigWeight {
        /*
        1. Почитать про диспетчеризация типов
        2. Интерфейс
        3. Класс машины, не впускать тяжелые столы
         */

        Leg[]               leg = new Leg[4];
        Tabletop            tabletop;
        Table               table;
        Leg[]               leg2 = new Leg[3];
        Tabletop            tabletop2;
        Separator           separator;
        TableWithSeparator  tablewithseparator;
        Table[]             tables1 = new Table[2];
        Table[]             tables2 = new Table[1];
        Vehincle            car;


        for (int i = 0; i < 4; i++)
            leg[i] = new Leg(70, 0.7F, "сталь");
        tabletop = new Tabletop(80, 80, 3, "стекло");
        table = new Table(leg, tabletop);

        for (int i = 0; i < 3; i++)
            leg2[i] = new Leg(80, 0.5F, "дерево");
        tabletop2 = new Tabletop(120, 60, 2, "дерево");
        separator = new Separator(50, 120, 0.2F, "пластик");
        tablewithseparator = new TableWithSeparator(leg2, tabletop2, separator);


        System.out.println("Вес стола " + table.getWeight());
        System.out.println("Вес стола с разделителем " + tablewithseparator.getWeight());

        tables1[0] = table;
        tables1[1] = tablewithseparator;
        tables2[0] = tablewithseparator;
        car = new Vehincle(4.8F);


        System.out.println("Загружено в машину: " + car.getWeightTables() + " кг.");
        System.out.println("Свободно в машине: " + car.getFreeWeight() + " кг.");

        try {
            car.loadTables(tables1);
        } catch (BigWeight exc) {
            System.out.println(exc.getMessage());
        }
        try {
            car.loadTables(tables2);
        } catch (BigWeight exc) {
            System.out.println(exc.getMessage());
        }

        System.out.println("Загружено в машину: " + car.getWeightTables() + " кг.");
        System.out.println("Свободно в машине: " + car.getFreeWeight() + " кг.");


        /*
            1. Обобщения (написать пример)
            2. Коллекции (list, set, map, Queue), изучить реализацию интерфейсов
            3. Различие интерфесов и абстрактных классов
            4. 
         */
    }
}
