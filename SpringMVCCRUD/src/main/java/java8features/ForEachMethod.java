package java8features;
import java.util.*;
import java.util.function.*;

public class ForEachMethod {
    public static void main(String[] args) {
        //forEach() method expects object of consumer interface implemented class and
        // using that object it calls accept() method by passing each value of the list
        List<Integer> lst=new ArrayList<>(List.of(1,5,6,7,3));
//        lst.forEach(new Consumer<Integer>(){
//            public void accept(Integer i){
//                System.out.println(i);
//            }
//        });
        lst.forEach( (i)-> System.out.println(i));


    }
}
