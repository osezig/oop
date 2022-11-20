public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");

        Human max = new Human(1981, "Махо", "Пинск", "кочегар");
        Human ann = new Human(1991, "АннаВася", "Москва", "старший кочегар");
        Human kate = new Human(1992, "Катя", "Степанакерт", "кочегар по особо важным делам");
        Human artem = new Human(1995, "Артэм", "Полоцк", "директором по развитию кочегаров");

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
        Car lada = new Car("Жигули ", " BMX ", 1.9, " Желтый ", 1987, " СССР");
        Car audi = new Car("Запорожец ", " A8 ", 1.0, " Черный ", 2020, " Германия");
        Car bmw = new Car("Москвич ", " Panamera ", 2.0, " Черный ", 2000, " Германия");
        Car kia = new Car("АВТО ", " SuperMax ", 2.4, " Красный ", 2018, " Южная Корея");
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
