package designPatterns.behavioral.observer;

public class Subscriber {
    //name of subscriber
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    private Channel channel=new Channel();
    //every time when a new video is uploaded in channel it will call update method of subscriber
    public void update(){
        System.out.println("Hey "+name+" Video updated");
    }
    public void subscribeChannel(Channel ch){
        channel=ch;
    }
}
