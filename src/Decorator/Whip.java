package Decorator;

public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        description = "Soy";
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + cost() + " ";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.55;
    }
}
