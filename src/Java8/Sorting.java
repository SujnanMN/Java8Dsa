package Java8;

import java.util.*;
import java.util.stream.Stream;

public class Sorting {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Integer[] numsArr = {5, 2, 8, 1, 9};
        List<Integer> nums = Arrays.asList(numsArr);

        Arrays.sort(numsArr);
        Stream.of(numsArr).forEach(System.out::print);
        System.out.println("");
        Arrays.sort(numsArr, Collections.reverseOrder());
        Arrays.stream(numsArr).forEach(System.out::print);
        System.out.println("");

        Collections.sort(nums);
        nums.stream().forEach(System.out::print);
        System.out.println("");
        Collections.sort(nums, Collections.reverseOrder());
        nums.stream().forEach(System.out::print);
        System.out.println("");

        nums.stream().sorted().forEach(System.out::print);
        System.out.println("");
        nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println("");

        nums.stream().sorted((a,b)->a-b).forEach(System.out::print);
        System.out.println("");
        nums.stream().sorted((a,b)-> b-a).forEach(System.out::print);
        System.out.println("");
        nums.stream().sorted((a,b)->a.compareTo(b)).forEach(a->System.out.print(a+ " "));
        System.out.println("");
        nums.stream().sorted((a,b)->b.compareTo(a)).forEach(a->System.out.print(a+ " "));
        System.out.println("");
        nums.stream().sorted(Comparator.naturalOrder()).forEach(System.out::print);
        System.out.println("");

        List<String> words = Arrays.asList("aabbcc", "aa", "zzz","zaaa","zz","za");

        //Sort by lex using compareTo
        words.stream().sorted((a,b)->a.compareTo(b)).forEach(a->System.out.print(a+" "));
        System.out.println("");
        words.stream().sorted((a,b)->b.compareTo(a)).forEach(a->System.out.print(a+" "));
        System.out.println("");
        //Sort by length, then by lex
        words.stream().sorted((a,b)->a.length()-b.length()).forEach(a->System.out.print(a+ " "));
        System.out.println("");
        words.stream().sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())).forEach(a->System.out.print(a+ " "));
        System.out.println("");


        List<Student> student = Arrays.asList(
                new Student(10, "Alice", 5000L),
                new Student(2, "Bob", 3000L),
                new Student(3, "Charlie", 7000L)
        );

        student.stream().sorted((a,b)->a.getId()-b.getId()).forEach(a->System.out.print(a.toString()+ " "));
        System.out.println("");
        student.stream().sorted(Comparator.comparingInt(Student::getId).reversed()).forEach(a->System.out.print(a.toString()+ " "));
        //equals sort 2nd highest
        student.stream().filter(stu->stu.getName().equals("Charlie")).sorted((a,b)->b.getId()-a.getId()).skip(1).findFirst().ifPresent(System.out::print);


    }
}
