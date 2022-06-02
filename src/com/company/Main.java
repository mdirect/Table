package com.company;

public class Main {
    public static void main(String[] args) {
        Table one = new Table(4);
        Table two = new Table(4, "ДСП");
        Table three = new Table(4, "пластик", "Китай");
        Table four = new Table(4, 80, 120, 60, "дерево", "Италия");
        Table five = new Table(4, 80, 100, 100, "стекло", "алюминий", "белый","Германия");

        System.out.println("Количество ног у первого стола: " + one.get_count_legs());
        System.out.println("Столешница второго стола сделана из " + two.get_tabletop_material());
        System.out.println("Третий стол сделан в " + three.get_made_in());
        System.out.println("Четвертый имеет высоту " + four.get_high() + " и длинну с шириной " + four.get_lenght() + "x" + four.get_widht());
        System.out.println("Пятый " + five.get_tabletop_colour() + " c ногами из " + five.get_legs_material());

        five.change_tabletop_colour("черный");
        System.out.println("Поменяли цвет. Теперь пятый " + five.get_tabletop_colour());

        five.change_tabletop("алюминий");
        System.out.println("Поменяли столешницу. Теперь у пятого " + five.get_tabletop_material());

        five.change_legs(3, "сталь");
        System.out.println("Заменили ножки стола. Теперь у пятого " + five.get_count_legs() + " " + five.get_legs_material() + " ног");
    }
}
