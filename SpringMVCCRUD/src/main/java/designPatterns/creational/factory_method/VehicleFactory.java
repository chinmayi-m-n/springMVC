package designPatterns.creational.factory_method;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        //according to type object of vehicle implementation class gets created
        if (type.equals("car"))return new Car();
        if(type.equals("bike"))return new Bike();
        return null;
    }
}
