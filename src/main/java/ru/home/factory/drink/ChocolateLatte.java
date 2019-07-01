package ru.home.factory.drink;

/**
 * Шоколадный латте
 * */

public class ChocolateLatte implements Drink{
    @Override
    public void makeDrink () throws Exception {
        System.out.println("Готовим ШОКОЛАДНЫЙ ЛАТТЕ:");
        Thread.sleep(1000);
        System.out.println("-> эспрессо 50мл");
        Thread.sleep(1000);
        System.out.println("-> молоко 150мл");
        Thread.sleep(1000);
        System.out.println("-> пена 50мл");
        Thread.sleep(1000);
        System.out.println("-> шоколадная крошка 15г");
        Thread.sleep(2000);
        System.out.println("ШОКОЛАДНЫЙ ЛАТТЕ готов!\n");
    }
}
