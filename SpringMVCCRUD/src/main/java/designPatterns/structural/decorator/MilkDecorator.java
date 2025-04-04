package designPatterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator{
    private SimpleCoffee simpleCoffee;

    public MilkDecorator(SimpleCoffee simpleCoffee){
        this.simpleCoffee=simpleCoffee;
    }
    @Override
    public String getDescription() {
        return simpleCoffee.getDescription()+" with extra milk";
    }

    @Override
    public int getCost() {
        return simpleCoffee.getCost()+10;
    }
}
