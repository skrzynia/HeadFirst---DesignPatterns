package Strategy;

public class WildDuck extends Duck{

    public WildDuck()
    {
        quackingInterface = new Quack();
        flyingInterface = new FlyingBecauseIHaveWings();
    }

    public void display()
    {
        System.out.println("I am the real duck");
    }
}
