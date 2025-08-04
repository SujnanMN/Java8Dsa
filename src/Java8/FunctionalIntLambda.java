package Java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalIntLambda {
    public static void main(String[] args) {

        Function<Integer, Double> fun = a -> Math.sqrt(a);
        Function<Integer, Double> fun1 = Math::sqrt;
        System.out.println(fun.apply(4));

        Supplier<String> sup = () -> "Hello Supplier";
        System.out.println(sup.get());

        Consumer<String> con = str -> System.out.println(str);
        Consumer<String> con1 =  System.out::println;
        con.accept("Hello Consumer");

        String[] strArray = {"a","b","z","k","d","A","Z"};
        Arrays.sort(strArray, (a,b) -> a.compareToIgnoreCase(b));
        Arrays.sort(strArray, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strArray));

        String[] strr = {"abc","defeg","esgrgrg","g"};
        Arrays.sort(strr, (a,b)->Integer.compare(a.length(),b.length()));
        System.out.println(Arrays.toString(strr));

        List<String> list = Arrays.asList("abc","abc","def");
        Function<List<String>, HashSet<String>> fun4 = a->new HashSet<>(a);
        Function<List<String>, HashSet<String>> fun3 = HashSet::new;
        System.out.println(String.join(", ", fun3.apply(list)));

        //Using threads TODO

    }
}

