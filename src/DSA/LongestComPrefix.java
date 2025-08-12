package DSA;

public class LongestComPrefix {

    public static void main(String[] args) {
        String[] arr1 = {"flower", "flow", "flight"};
        String prefix=arr1[0];
        for (int i=1; i<arr1.length; i++) {
            while(prefix.indexOf(arr1[i])!=0) {
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty())
                    System.out.println("Null");

            }
        }
        System.out.println(prefix);
    }
}
