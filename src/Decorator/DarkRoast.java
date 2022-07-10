package Decorator;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend coffe";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
