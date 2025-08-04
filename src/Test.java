import java.lang.reflect.Array;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
        String str = "This's!!& is a new String";
        str = str.replaceAll("[^a-zA-Z0-9\\s]","");

        String[] strArr = str.split("\\s+");
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr, (a,b) -> Integer.compare(b.length(), a.length()));
        System.out.println(Arrays.toString(strArr));
        //str.replaceAll()
    }
}
