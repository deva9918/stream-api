package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class StreamMain1 {
    public static void main(String [] args){

        //create a LIst and Filter numbers from list
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(78);
        list.add(200);

        System.out.println(list);
        List<Integer> list1 = List.of(2,3,50,21,22,67);//listof method is an immutable elemnt(cannot be changed)
        System.out.println(list1);

        List<Integer> list2 = asList(23,567,12,677,24);//asLIst is also immutable (cannot be changed)


        System.out.println( list2.stream().filter(i -> i>100).collect(Collectors.toList()));
        System.out.println(list1.stream().map(i -> i*i).collect(Collectors.toList()));
    }
}
