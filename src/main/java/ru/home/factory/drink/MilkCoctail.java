package ru.home.factory.drink;

/**
 * Молочный коктейль
 * */

public class MilkCoctail implements Drink{
    @Override
    public void makeDrink () throws Exception {
        System.out.println("Готовим МОЛОЧНЫЙ КОКТЕЙЛЬ:");
        Thread.sleep(1000);
        System.out.println("-> молоко 300мл");
        Thread.sleep(1000);
        System.out.println("-> мороженое 'пломбир' 100мл");
        Thread.sleep(1000);
        System.out.println("-> какао 20г");
        Thread.sleep(1000);
        System.out.println("-> ванильный сахар 5г");
        Thread.sleep(1000);
        System.out.println("-> банан 1шт");
        Thread.sleep(2000);
        System.out.println("МОЛОЧНЫЙ КОКТЕЙЛЬ готов!\n");
    }
}
