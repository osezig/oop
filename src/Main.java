public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");

        Human max = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human ann = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human kate = new Human(1992, "Катя", "Калиниград", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");

        System.out.println("Задание 1");
        max.outPutFirstTask();
        ann.outPutFirstTask();
        kate.outPutFirstTask();
        artem.outPutFirstTask();

        System.out.println("Задание 2");
        max.outPutSecondTask();
        ann.outPutSecondTask();
        kate.outPutSecondTask();
        artem.outPutSecondTask();

        System.out.println("Задание 3");
        Car lada = new Car("Лада ", "Granta", 1.7, " Желтый ", 2015, " СССР");
        Car audi = new Car("Audi ", "A8 50 L TDI quattro ", 3.0, " Черный ", 2020, " Германия");
        Car bmw = new Car("BMW ", " Z8 ", 3.0, " Черный ", 2021, " Германия");
        Car kia = new Car("KIA ", " Sportage 4 ", 2.4, "красный ", 2018, " Южная Корея");
        Car hyundai  = new Car("Hyundai ", " Avante ", 1.6, " Оранжевый ", 2016, " Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        max.outPutSecondTask();
        ann.outPutSecondTask();
        kate.outPutSecondTask();
        artem.outPutSecondTask();

        System.out.println("Задание 2");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        artem.town = "";
        artem.outPutThirdTask();

        System.out.println("Задание 2");
        Car test = new Car(null, "", -1.5, null, -2000, "");
        System.out.println(test);



    }

    }
