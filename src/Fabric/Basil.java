package Fabric;

public class Onion extends Vegetable {
    @Override
    public void description() {
        setName("Onion");
        System.out.println("Adding " + getName());
    }
}
