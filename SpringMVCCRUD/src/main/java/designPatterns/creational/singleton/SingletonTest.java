package designPatterns.creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        //same object that is created at time of class loading gets returned
        //each time when the getEagerMethod() is called
        SingletonEager eagerInstance1=SingletonEager.getEagerInstance();
        SingletonEager eagerInstance2=SingletonEager.getEagerInstance();
        System.out.println(eagerInstance2);
        System.out.println(eagerInstance1);
        SingletonStaticBlock staticInstance1=SingletonStaticBlock.getInstance();
        SingletonStaticBlock staticInstance2=SingletonStaticBlock.getInstance();
        System.out.println(staticInstance1);
        System.out.println(staticInstance2);
        SingletonLazy lazy1=SingletonLazy.getInstance();
        SingletonLazy lazy2=SingletonLazy.getInstance();
        System.out.println(lazy1);
        System.out.println(lazy2);
    }
}
