package designPatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        //building object of phoneBuilder step by step using builder pattern
        PhoneBuilder phone=PhoneBuilder.getPhone()
                .setBattery(100)
                .setOs("Android")
                .setProcessor("samsung")
                .setRam(8)
                .setScreenSize(2.4);
        System.out.println(phone);
    }
}
