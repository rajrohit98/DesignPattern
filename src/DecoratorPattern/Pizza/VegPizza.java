package DecoratorPattern.Pizza;

public class VegPizza extends BasePizza{

    @Override
    public int getPizzaCost() {
        return 100;
    }
}
