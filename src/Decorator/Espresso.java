package Decorator;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast coffee";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
