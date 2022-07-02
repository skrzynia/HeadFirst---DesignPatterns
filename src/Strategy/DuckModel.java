package Strategy;

public class DuckModel extends Duck{

    public DuckModel() {

        flyingInterface = new NotFlying();
        quackingInterface = new Quack();

    }

    @Override
    public void display() {

        System.out.println("I am a duck's model");
    }
}
