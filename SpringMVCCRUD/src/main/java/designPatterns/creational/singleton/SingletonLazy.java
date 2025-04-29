package designPatterns.creational.singleton;

public class SingletonLazy {
    private static SingletonLazy lazyInstance;

    private SingletonLazy(){

    }
    public static SingletonLazy getInstance(){
        if(lazyInstance==null){
            //create object only if it is not instantiated before
            lazyInstance=new SingletonLazy();
        }

        return lazyInstance;
    }
}
