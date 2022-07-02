package Strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck wild = new WildDuck();
        wild.executueQuack();
        wild.executeFly();


        Duck model = new DuckModel();
        model.executeFly();
        model.setFlyingInterface(new FlyWithRocketEngine());
        model.executeFly();
    }
}
