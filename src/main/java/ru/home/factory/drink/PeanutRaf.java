package ru.home.factory.drink;
/**
 * Ореховый раф
 * */

public class PeanutRaf implements Drink{
    @Override
    public void makeDrink () throws Exception {
        System.out.println("Готовим ОРЕХОВЫЙ РАФ:");
        Thread.sleep(1000);
        System.out.println("-> эспрессо 25мл");
        Thread.sleep(1000);
        System.out.println("-> ванильный сахар 5г");
        Thread.sleep(1000);
        System.out.println("-> сахар 5г");
        Thread.sleep(1000);
        System.out.println("-> сливки 15%");
        Thread.sleep(1000);
        System.out.println("-> ореховый сироп 20мл");
        Thread.sleep(2000);
        System.out.println("ОРЕХОВЫЙ РАФ готов!\n");
    }
}
