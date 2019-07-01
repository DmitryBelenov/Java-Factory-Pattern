package ru.home.factory.factories;


import ru.home.factory.drink.Drink;

/**
 * Фабрика напитков
 * */

public interface DrinkFactory {
    Drink createDrink();
}
