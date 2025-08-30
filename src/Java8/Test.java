package Java8;

import java.io.Serializable;
import java.rmi.Remote;
import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test implements Remote {

    public static void main(String[] args) {
        String s = "zaacdeea";
        StringBuilder sb = new StringBuilder();
         //s.chars().mapToObj(c->(char)c).sorted().map(c->sb.append(c));
        //s.chars().sorted().mapToObj(c->(char)c).collect(String::new);
        List<Student> str = Collections.singletonList(new Student(1, "Sujnan",70.0));
        //str.stream().sorted(Comparator.comparing(Student::getMarks)).reduce()
        sb.toString();
        //Student st = new Student()
        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 9);
        Collections.sort(nums);
        Collections.reverseOrder();

        List<String> words = Arrays.asList("banana", "apple", "cherry");
        words.stream().sorted((a,b)->a.length()-b.length())
                .sorted((a,b)->a.compareTo(b)).forEach(a->System.out.print(a+ " "));
        nums.stream().sorted((a,b)->{
            return b-a;
        }). forEach(System.out::print);

        //Collections.fill(words,);
        //words.stream().collect(String::new);
        int sum=0;
        //nums.stream().sorted(Integer::compareTo).reduce(Integer::max).
        //System.out.print(Stream.of(words)
        //words.stream().max();
        nums.stream().sorted((a,b)->a.compareTo(b)).forEach(a->System.out.print(a+ " "));
        //nums.stream().for
        //ForkJoinPool.commonPool()
        //Integer.I
        IntStream.range(0,1000).sum();
        words.stream().mapToInt(String::length).sum();


    }
}
