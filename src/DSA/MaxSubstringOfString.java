package DSA;

public class MaxSubstringOfString {
    public static void main(String[] args) {
        String input = "aaabbccccddeeezzzzzpprrrrrrrgggggggggggggggggg";
        //Map<Character, Integer> map = new HashMap<>();
        String maxString = "";
        int maxCount=0, count=1;
        //char prev='';
        for(int i=0; i<input.length()-1; i++) {
            if (input.charAt(i)==input.charAt(i+1)) {
                count++;

                if (i==input.length()-2 && count>maxCount) {
                    maxCount=count;
                    maxString=input.substring(i-count+2,i+2); //27-7+1
                }
            }
            else {
                if (count>maxCount) {

                    maxCount=count;
                    maxString=input.substring(i-count+1,i+1);

                }
                count = 1;

            }
        }

        System.out.println(maxCount + " " + maxString);
    }
}
