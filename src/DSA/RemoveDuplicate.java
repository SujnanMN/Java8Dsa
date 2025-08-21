package DSA;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println(result);  // Output: progamin
    }

    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) {      // add returns false if c is already present
                sb.append(c);
            }
        }

        str.chars().mapToObj(a->(char)a).distinct().forEach(System.out::print);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.chars().mapToObj(a->(char)a)).reverse();
        return sb.toString();


    }
}
