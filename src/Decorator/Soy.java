package Decorator;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        description = "Mocha";
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + cost() + " ";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.35;
    }
}
