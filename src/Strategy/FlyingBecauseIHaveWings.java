package Strategy;

public class FlyingBecauseIHaveWings implements FlyingInterface {
    @Override
    public void fly() {
        System.out.println("Yikesss! I am flying");
    }
}
