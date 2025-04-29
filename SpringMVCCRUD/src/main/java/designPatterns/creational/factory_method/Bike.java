package designPatterns.creational.factory_method;

public class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving in bike");
    }
}
