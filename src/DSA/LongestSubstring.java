package DSA;

import java.util.Arrays;
import java.util.Comparator;

public class LongestSubstring {

    public static void main(String[] args) {
        String[] str = {"flowers", "flow", "fly", "flight"};
        String ans = str[0];

        for (int i = 1; i < str.length; i++) {

            while (str[i].indexOf(ans) == -1) {
                ans = ans.substring(0, ans.length() - 1);
                if (ans.isEmpty()) ans = "";

            }
        }
        System.out.println(ans);
    }

}


 class LongestSubstring2 {

    public static void main(String[] args) {
        String[] str = {"flowers", "flow", "fly", "flight"};
        String ans = str[0];

        String min = Arrays.stream(str).min(Comparator.comparingInt(String::length)).orElse("");

        for(int i=0; i<min.length(); i++) {
            final int j=i;

            boolean match = Arrays.stream(str).allMatch(s->s.charAt(j)==min.charAt(j));

            if (!match)
                System.out.println(min.substring(0,i));

        }
    }

}
