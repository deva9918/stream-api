package att;

import java.util.*;
import java.util.stream.Collectors;

public class att {
    public static <list> void main(String[] args) {
        List<Integer> list = Arrays.asList(1,8 ,2,6,7,3,24,89,34,99,12);
        //square of each number
        System.out.println(list.stream().map(a->a*a).collect(Collectors.toList()));
        //sum
        System.out.println(list.stream().mapToInt(value -> value).sum());
        //max using comparator
        System.out.println(list.stream().max(Comparator.comparing(Integer::valueOf)).get());
        //max with an optional int
        System.out.println(list.stream().mapToInt(a -> a).max());
        //max with int
        System.out.println(list.stream().mapToInt(a -> a).max().getAsInt());
        //just collectiong list
        System.out.println(list.stream().collect(Collectors.toList()));
        //adding every elememt in list with optional integer
        System.out.println(list.stream().reduce((a,b) -> a+b));
        //adding every elememt in list
        Optional<Integer> dlist = list.stream().reduce((a, b) -> a+b );
        System.out.println(dlist.get());
        //min in the list with optional int
        System.out.println(list.stream().mapToInt(a->a).min());
        //min without optinal
        System.out.println(list.stream().mapToInt(a->a).min().getAsInt());
        //average
        System.out.println(list.stream().mapToInt(a->a ).average().getAsDouble());
        //double and average greater than 100
        System.out.println(list.stream().map(a->a*a).filter(a->a>100).mapToInt(a->a).average());
        //numbers which starts with
        System.out.println(list.stream().map(a-> String.valueOf(a)).filter(a->a.startsWith("2")).map(Integer:: valueOf).collect(Collectors.toList()));

        //even numbers
        System.out.println(list.stream().filter(a->a%2==0).collect(Collectors.toList()));
        //odd numbers
        System.out.println(list.stream().filter(a->a%2!=0).collect(Collectors.toList()));


    }
}
