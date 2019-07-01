package ru.home.factory.factories;


import ru.home.factory.drink.ChocolateLatte;
import ru.home.factory.drink.Drink;

/**
 * Фабрика латте
 * */

public class LatteFactory implements DrinkFactory {
    @Override
    public Drink createDrink () {
        return new ChocolateLatte();
    }
}
