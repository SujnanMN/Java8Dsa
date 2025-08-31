package Java8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcd";

        String rev = new StringBuilder(str).reverse().toString();
         String rev2 =  IntStream.range(0, str.length())
                 .mapToObj(i->String.valueOf(str.charAt(str.length()-1-i)))
                 .collect(Collectors.joining(" "));
         String rev3 = str.chars()
                 .mapToObj(c->String.valueOf(c))
                 .reduce("",(a,b)->b+a);


         List list = null;
        list.stream()
                .collect(Collectors
                        .groupingBy(Function.identity(),
                                Collectors.counting()));

    }
}
