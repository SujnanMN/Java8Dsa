package DSA;

import java.util.Arrays;
import java.util.List;

public class Pattern {

    public static void main(String[] args) {
        //patternSeven();
        //System.out.println(isPalindrome(121));
        //System.out.println(isPrime(29));
        revArrayRecursion(null);
    }

    public static void patternFour() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println("");
        }
    }

    public static void patternSeven() {
        int n=5;
        int k=1;
        for  (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j=0; j<k; j++) {
                System.out.print("*");
            }
            k+=2;
            System.out.println("");
        }
    }

    public static void patternNine() {
        int n=5;
        int k=1;
        for  (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j=0; j<k; j++) {
                System.out.print("*");
            }
            k+=2;
            System.out.println("");
        }
    }

    private static boolean isPalindrome(int num) {
        int rev=0;
        int temp=num;
        while(num!=0) {
            int dig = num%10;
            rev = rev *10+dig;
            num=num/10;
        }

        System.out.println(rev);
        return temp == rev;
    }

    private static String isPrime(int num) {
        if (num<=0)
            return "NA";
        else if (num==1)
                return "Prime";
        else
        for(int i=2; i<=Math.sqrt(num); i++) {
            if (num%i==0)
                return "Composite";
        }
        return "Prime";
    }


    private static int[] revArrayRecursion(int[] arr) {
         recursion(5);
         return null;
    }

    private static void recursion (int n) {
        //int i=0;
        if (true)
            return;
        else {
            System.out.println(n);

            recursion(n-1);
        }
    }

    public static void interviewQ(String[] str) {
        Integer[] arr = {1000, 2000, 3000, 30000};
        List<Integer> list = Arrays.asList(arr);
        list = list.stream().filter(x -> x < 10000).map(x -> x + x / 10).toList();
        //.stream().filter(x-> x<20000)
        //.map(y->y=y+y/10).toList();
        System.out.println(list);
    }


}
