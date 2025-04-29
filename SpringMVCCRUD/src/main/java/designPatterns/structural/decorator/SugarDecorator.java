package designPatterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator{
    //decorator always expects base class object on which decoration is to be applied
    private SimpleCoffee simpleCoffee;
    public SugarDecorator(SimpleCoffee simpleCoffee){
        this.simpleCoffee=simpleCoffee;
    }

    @Override
    public String getDescription() {
        //get the properties of passed base class object add some extra properties
        return simpleCoffee.getDescription()+" with extra sugar";
    }

    @Override
    public int getCost() {
        return simpleCoffee.getCost()+10;
    }
}
