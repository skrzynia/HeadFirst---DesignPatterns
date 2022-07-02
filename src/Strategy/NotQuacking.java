package Strategy;

public class NotQuacking implements QuackingInterface{
    @Override
    public void quack() {
        System.out.println("<<<SILENT>>>");
    }
}
