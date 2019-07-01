package ru.home.factory.drink;

/**
 * Ванильный капучино
 * */

public class VanillaCappuccino implements Drink {
    @Override
    public void makeDrink () throws Exception {
        System.out.println("Готовим ВАНИЛЬНЫЙ КАПУЧИНО:");
        Thread.sleep(1000);
        System.out.println("-> эспрессо 50мл");
        Thread.sleep(1000);
        System.out.println("-> молоко 80мл");
        Thread.sleep(1000);
        System.out.println("-> сахар 15г");
        Thread.sleep(1000);
        System.out.println("-> сироп 'ваниль' 15мл");
        Thread.sleep(2000);
        System.out.println("ВАНИЛЬНЫЙ КАПУЧИНО готов!\n");
    }
}
