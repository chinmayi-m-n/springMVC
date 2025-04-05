package designPatterns.behavioral.observer;

public class Youtube {
    public static void main(String[] args) {
        Channel javaChannel=new Channel();
        Subscriber s1=new Subscriber("amulya");
        Subscriber s2=new Subscriber("aakash");
        Subscriber s3=new Subscriber("bindu");
        Subscriber s4=new Subscriber("babu");
        javaChannel.subscribe(s1);
        javaChannel.subscribe(s2);
        javaChannel.subscribe(s3);
        javaChannel.subscribe(s4);
        javaChannel.upload("Introduction to java programming");



    }
}
