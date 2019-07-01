package ru.home.factory.factories;


import ru.home.factory.drink.Drink;
import ru.home.factory.drink.MilkCoctail;

/**
 * Фабрика коктейлей
 * */

public class CoctailFactory implements DrinkFactory {
    @Override
    public Drink createDrink () {
        return new MilkCoctail();
    }
}
