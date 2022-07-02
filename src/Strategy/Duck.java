package Strategy;

public abstract class Duck {
    FlyingInterface flyingInterface;
    QuackingInterface quackingInterface;

    public abstract void display();

    public void executeFly()
    {
        flyingInterface.fly();
    }

    public void executueQuack()
    {
        quackingInterface.quack();
    }

    public void swim()
    {
        System.out.println("All ducks swim, even those artificial");
    }

    public void setFlyingInterface(FlyingInterface fi)
    {
        flyingInterface = fi;
    }

    public void setQuackingInterface(QuackingInterface qi)
    {
        quackingInterface = qi;
    }
}
