package designPatterns.creational.prototype;

public class Client {
    public static void main(String[] args){
        //construct prototype using constructor
        Student s1=new Student();
        Student s2=s1.clone();
        System.out.println(s1.getUsn()+" "+s1.getName()+" "+s1.getCollege());
        System.out.println(s2.getUsn()+" "+s2.getName()+" "+s2.getCollege());
    }
}
