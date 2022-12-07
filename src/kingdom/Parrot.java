package kingdom;

public class Parrot extends Bird implements FlyingBird {
    @Override
    public void fly() {
        System.out.print(" An Parrot can fly ");
    }
    public void sing() {
        System.out.println(" A Parrot can sing ");
    }

}
