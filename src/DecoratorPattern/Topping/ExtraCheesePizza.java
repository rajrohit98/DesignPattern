package DecoratorPattern.Topping;

import DecoratorPattern.Pizza.BasePizza;

public class ExtraCheesePizza extends ToppingDecorator{

    BasePizza pizza;

    public ExtraCheesePizza(BasePizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int getPizzaCost() {
        return this.pizza.getPizzaCost() + 25;
    }
}
