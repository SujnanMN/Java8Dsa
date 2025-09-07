import java.io.Serializable;
import java.lang.reflect.Array;
import java.rmi.Remote;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test implements Cloneable, EventListener, Remote, RandomAccess, Serializable {
    public static void main(String[] args) throws CloneNotSupportedException {

        String str = "This a computer with a software";
        System.out.println(str.split("\\s+").toString());
        System.out.println(str.hashCode());
        str.intern();
        //Arrays.stream(str.split("\\s+")).
        str.chars().mapToObj(a->(char)a).distinct().forEach(System.out::println);


        Map<Integer, String> map = new HashMap<>();
        map.put(1,"abc");
        System.out.println(map.hashCode());
        //Objects
        //getClass()
        //Frequency:
        Stream.of();
        Map<Integer,String> map2 = map.entrySet().stream()
                .filter(entry-> entry.getKey()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
                //collect(Collectors.groupinBy(Function.identity(),Collectors.counting()))

        Character c = null;
        //Integer.pars

        //Diagonal elements
        //short long
        //shortest distansce

        Test test = new Test();
        Test t2= (Test)test.clone(); //Shallow clone
        test.testNonStatic();

    }

    public void testNonStatic () {
        return;
    }
}
