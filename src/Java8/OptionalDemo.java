package Java8;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        //empty() of() ofNullable()

        Optional<String> emp = Optional.empty();
        //THrows exception when null
        Optional<String> optString =  Optional.of(null);
        Optional<String> optString2 = Optional.ofNullable(null);

        if (optString2.isPresent()) {
            optString2.get();
        } else {

        }

        Optional<String> optt = Optional.ofNullable("ABC");
        optt.orElse("It is empty");
        optt.orElseGet(()->"Empty");
        optt.orElseThrow(RuntimeException::new);
        optt.ifPresent(a->System.out.print(a));
        optt.filter(a->a.startsWith("A")).map(a->a.toLowerCase()).ifPresent(System.out::println);


    }
}
