package Java8;

import java.util.*;
import java.util.stream.Stream;

public class SteamsApi {

    public static void main(String[] args) {
        Stream<String> str1 = Stream.of("ab","bc","de");

        Collection<String> col = Arrays.asList("as","bc");
        Stream<String> str2 = col.stream();

        //COnsumer only
        str2.forEach(System.out::println);

        for(String str : col) {

        }

        //Parallel stream TODO
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"sujnan",88.5));
        list.add(new Student(3,"zebra",90));
        list.add(new Student(0,"anil",70));

        list.stream().sorted(Comparator.comparing(Student::getId)).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(Student::getId).reversed()).forEach(System.out::println);

        List<String> list2 = Arrays.asList("abc","def","a");
        list2.stream().sorted().forEach(System.out::println);
        Collections.sort(list2,Comparator.comparingInt(String::length));
        list2.stream().skip(1).findFirst().ifPresent(System.out::println);

        Map<Integer, Integer> map = new HashMap<>();
        map.forEach((k,v)->{
                    System.out.println(k);
                    System.out.println(v);
                });

//      predictae bipred

    }
}
