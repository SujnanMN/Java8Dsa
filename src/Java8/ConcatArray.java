package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatArray {

    public static void main(String[] args) {
        int [] a={1, 2, 3}, b={4, 6};
        IntStream.concat(Arrays.stream(a), Arrays.stream(b)).forEach(System.out::print);
    }
}
