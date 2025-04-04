package designPatterns.creational.singleton;

public class SingletonStaticBlock {
    private static SingletonStaticBlock instance;
    //instance is initialized by object at the time of class loading as static block gets executed only once at the time of class loading
    static{
        instance=new SingletonStaticBlock();
    }
    private SingletonStaticBlock(){

    }
    public static SingletonStaticBlock getInstance(){
        return instance;
    }
}
