package Decorator;

public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
