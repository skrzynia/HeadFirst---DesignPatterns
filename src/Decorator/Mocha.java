package Decorator;

public class Milk extends CondimentDecorator{

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + cost();
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
