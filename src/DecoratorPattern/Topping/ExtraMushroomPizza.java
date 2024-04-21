package DecoratorPattern.Topping;

import DecoratorPattern.Pizza.BasePizza;

public class ExtraMushroomPizza extends ToppingDecorator{

    BasePizza pizza;

    public ExtraMushroomPizza(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPizzaCost() {
        return this.pizza.getPizzaCost() + 100;
    }
}
