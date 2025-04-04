package designPatterns.structural.decorator;

public class ChocolateDecorator extends CoffeeDecorator {
    private SimpleCoffee simpleCoffee;
    ChocolateDecorator(SimpleCoffee coffee){
        simpleCoffee=coffee;
    }
    @Override
    public String getDescription() {
        //get the description associated with coffee add some more description
        return simpleCoffee.getDescription()+" with chocolate";
    }

    @Override
    public int getCost() {
        return simpleCoffee.getCost()+10;
    }
}
