package Java8;

import java.util.*;
import java.util.function.*;

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

        //Optional.ofNullable(list).ifPresent(System.out::println);

        Predicate<Double> p = n->n%2==0;
        p.test(40.0);

        Consumer<Integer> c = e->System.out.println(e);
        Consumer<Integer> c2 = System.out::print;
        c.accept(22);

        Supplier<Double> s = ()->Math.random();
        Supplier<Double> s2 = Math::random;
        s.get();

        Function<String, Character> f = e->e.charAt(0);
        Function<String, Integer> f2 = String::length;
        f.apply("abc");

        BiFunction<String, String, Integer> bf = (a, b)->a.length()+b.length();
        bf.apply("ab","cde");

        BiConsumer<String, String> bc = (a,b)->System.out.println(a+b);
        bc.accept("abc","def");

        //BiPredicate
        BiPredicate<Integer, Integer> bp =  (a,b)->a+b>0;
        bp.test(2,10);

        UnaryOperator<String> uo = String::toUpperCase;
        uo.apply("abc");

        BinaryOperator<String> bo = (a,b)->a.concat(b);
        bo.apply("abc","def");


        //Return type specified in class itself
        //DoubleSupplier
        DoubleSupplier ds = Math::random;
        ds.getAsDouble();
        //BooleanSupplier
        //DoublePredicate
        //DoubleFunction
        //IntFunction

    }
}

