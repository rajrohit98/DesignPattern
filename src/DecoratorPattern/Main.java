package DecoratorPattern;

import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Pizza.NonVegPizza;
import DecoratorPattern.Pizza.VegPizza;
import DecoratorPattern.Topping.ExtraCheesePizza;
import DecoratorPattern.Topping.ExtraMushroomPizza;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraMushroomPizza(new NonVegPizza());
        System.out.println(pizza.getPizzaCost());

        BasePizza pizza2 = new ExtraCheesePizza(new VegPizza());
        System.out.println(pizza2.getPizzaCost());
    }
}
