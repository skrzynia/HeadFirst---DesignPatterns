package Strategy;

public class Squeal implements QuackingInterface{
    @Override
    public void quack() {
        System.out.println("Squealing!");
    }
}
