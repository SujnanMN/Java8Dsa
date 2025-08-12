package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        System.out.println(methodCall());
    }

    private static boolean methodCall() {
        String s = "foo", t = "bar";
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        int a=   s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (mapS.containsKey(s.charAt(i))) {
                if (mapS.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            else {
                mapS.put(s.charAt(i), t.charAt(i));
            }


            if (mapT.containsKey(t.charAt(i))) {
                if (mapT.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                } }else {
                mapT.put(t.charAt(i), s.charAt(i));
            }


        }
        return true;

    }

    //TODO
    public boolean isIsomorphic(String s, String t) {
        int[] sm = new int[256], tm = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int sc = s.charAt(i), tc = t.charAt(i); //101 97 map indev vs value
            if (sm[sc] == 0 && tm[tc] == 0) {
                sm[sc] = tc;
                tm[tc] = sc;
            } else if (sm[sc] != tc) return false;
        }
        return true;
    }

}


