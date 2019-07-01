package ru.home.factory.factories;

import ru.home.factory.drink.Drink;
import ru.home.factory.drink.VanillaCappuccino;

/**
 * Фабрика капучино
 * */

public class CappuccinoFactory implements DrinkFactory {
    @Override
    public Drink createDrink () {
        return new VanillaCappuccino();
    }
}
