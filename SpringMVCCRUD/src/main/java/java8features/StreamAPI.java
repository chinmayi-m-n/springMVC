package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list= List.of(4,3,2,1,6,7);
        Stream<Integer> stream=list.stream();
        //filter odd numbers
        //double them
        //add the resultant stream
        Integer res=stream.filter(n-> n%2==1)
                .map(n-> n*2)
                .reduce(0,(c,e)->c+e);
        System.out.println(res);
    }
}
