package ru.home.factory;

import ru.home.factory.drink.Drink;
import ru.home.factory.factories.*;

import java.util.Scanner;

/**
 * Реализация паттерна 'Фабрика'
 * на примере автомата для напитков 'Barista'
 *
 * @author Belenov Dmitry
 * */

public class Barista {

    /**
     * Главный метод работы автомата 'Barista'
     * */

    public static void main (String[] args) throws Exception {
        System.out.println("Добро пожаловать в 'Barista'!");
        Thread.sleep(1000);
        System.out.println("МЕНЮ:\n1 - ореховый раф\n2 - ванильный капучино\n3 - шоколадный латте\n4 - молочный коктейль\n5 - ягодный фреш");
        while (true) {
            System.out.println("выберите номер напитка из меню:");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            DrinkFactory drinkFactory = setFactoryByDrink(choice);
            if (drinkFactory == null)
                System.out.println("Такого номера нет в меню..");
            else {
                Drink drink = drinkFactory.createDrink();
                drink.makeDrink();
            }
        }
    }

    /**
     * Фабричный метод
     * */

    private static DrinkFactory setFactoryByDrink(String drink){
        switch (drink){
            case "1":
                return new RafFactory();
            case "2":
                return new CappuccinoFactory();
            case "3":
                return new LatteFactory();
            case "4":
                return new CoctailFactory();
            case "5":
                return new FreshFactory();
            default:
                break;
        }
        return null;
    }
}
