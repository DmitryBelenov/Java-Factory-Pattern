package ru.home.factory.drink;

/**
 * Ягодный фреш
 * */

public class FreshBerry implements Drink{
    @Override
    public void makeDrink () throws Exception {
        System.out.println("Готовим ЯГОДНЫЙ ФРЕШ:");
        Thread.sleep(1000);
        System.out.println("-> клубника 3шт");
        Thread.sleep(1000);
        System.out.println("-> черника 10шт");
        Thread.sleep(1000);
        System.out.println("-> смородина 10шт");
        Thread.sleep(1000);
        System.out.println("-> банан 1 шт");
        Thread.sleep(1000);
        System.out.println("-> апельсин 2кус");
        Thread.sleep(1000);
        System.out.println("-> ванильный сахар 5г");
        Thread.sleep(1000);
        System.out.println("-> тёртый лед 100гр");
        Thread.sleep(2000);
        System.out.println("ЯГОДНЫЙ ФРЕШ готов!\n");
    }
}
