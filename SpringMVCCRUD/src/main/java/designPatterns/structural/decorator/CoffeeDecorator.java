package designPatterns.structural.decorator;

public abstract class CoffeeDecorator extends SimpleCoffee{
    //has abstract methods  that extends CoffeeDecorator shud implement it
    public abstract String getDescription();
    public abstract int getCost();
}
