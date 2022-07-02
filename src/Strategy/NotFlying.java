package Strategy;

public class NotFlying implements FlyingInterface{

    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
