package designPatterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        SimpleCoffee coffee=new SimpleCoffee();
        System.out.println(coffee.getDescription()+" cost:"+coffee.getCost());
        //adding extra milk
        coffee=new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()+" cost:"+coffee.getCost());
        coffee=new ChocolateDecorator(coffee);
        System.out.println(coffee.getDescription()+" cost:"+coffee.getCost());
        coffee=new SugarDecorator(coffee);
        System.out.println(coffee.getDescription()+" cost:"+coffee.getCost());
    }
}
