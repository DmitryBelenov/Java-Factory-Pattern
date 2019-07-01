package ru.home.factory.factories;


import ru.home.factory.drink.Drink;
import ru.home.factory.drink.FreshBerry;

/**
 * Фабрика фрешей
 * */

public class FreshFactory implements DrinkFactory {
    @Override
    public Drink createDrink () {
        return new FreshBerry();
    }
}
