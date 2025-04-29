package designPatterns.creational.factory_method;

public class Client {
    public static void main(String[] args) {
        //client class will only requests for a particular object to vehcile factory
        //vehicle factory method will create and return the object according to type of request made
        Vehicle v1=VehicleFactory.getVehicle("car");
        Vehicle v2=VehicleFactory.getVehicle("bike");
        v1.drive();
        v2.drive();



    }
}
