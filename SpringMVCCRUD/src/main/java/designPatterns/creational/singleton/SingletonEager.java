package designPatterns.creational.singleton;

public class SingletonEager {
    //static variable memory allocation and initialization happens at the time of class loading
    //so below object gets created only once at the time of class loading and same object is returned whenever requested using method
    private static SingletonEager eagerInstance=new SingletonEager();
    private SingletonEager(){

    }
    public static SingletonEager getEagerInstance(){
        return eagerInstance;
    }

}
