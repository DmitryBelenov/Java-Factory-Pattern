package ru.home.factory.factories;


import ru.home.factory.drink.Drink;
import ru.home.factory.drink.PeanutRaf;

/**
 * Фабрика рафов
 * */

public class RafFactory implements DrinkFactory {
    @Override
    public Drink createDrink () {
        return new PeanutRaf();
    }
}
