package work;

import java.util.*;
import java.util.stream.Collectors;

public class duplicateElementsa {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,10,10,3,1);
       list.stream().filter(a -> Collections.frequency(list,a)>1).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
        Set<Integer> set= new HashSet<>();
       list.stream().filter(a -> ! set.add(a)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
//        Set<Integer> newlist = list.stream().filter(a -> set.add(a)).collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(list);
//        System.out.println(newlist);
        System.out.println(list.stream().map(a-> Collections.frequency(list,a)).collect(Collectors.toList()));
    }
}
