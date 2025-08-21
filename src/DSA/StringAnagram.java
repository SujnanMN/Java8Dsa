package DSA;

import org.w3c.dom.ls.LSOutput;

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

        System.out.println(true);

        anagramJava8();
    }

    private static void anagramJava8() {
        String s = "anagram", t = "nagaram";

        var sMap = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        var tMap = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        if (sMap.equals(tMap))
             System.out.println(true);
    else System.out.println(false);
    }
}
