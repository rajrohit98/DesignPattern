package DecoratorPattern.Pizza;

public class NonVegPizza extends BasePizza {

    @Override
    public int getPizzaCost() {
       return 200;
    }
}
