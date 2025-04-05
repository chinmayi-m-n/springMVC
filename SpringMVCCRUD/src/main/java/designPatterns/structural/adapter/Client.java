package designPatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        AdapterClass obj = new AdapterClass();
        obj.addNum(10, 20);
        obj.subNum(10,20);
    }
}
