package DSA;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        int[] arr = new int[256];
        for(char sc: s.toCharArray()) {
            arr[sc]+=1;
        }

        for (char tc: t.toCharArray()) {
            if (arr[tc]==0)
                System.out.println(false);
            else
                arr[tc]-=1;
        }

        System.out.println(true); var a = 23;
        //var freqS = aa;

        var freqS = s.chars()
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(freqS);

        List<String> list = Arrays.asList("abc","abcd","abc");
        System.out.println((list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()))));


    }
}
