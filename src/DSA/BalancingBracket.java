package DSA;

public class BalancingBracket {

    public static void main(String[] args) {
        String str = "(())()((()))";
        StringBuilder build = new StringBuilder();

        int bal=0;
        for (char c: str.toCharArray()) {
            if (c=='(') {
                bal++;
                if (bal>1)
                    build.append('(');

            }
            else if (c==')') {
                if (bal>1)
                    build.append(")");
                bal--;

            }

        }

        System.out.println(build.toString());
    }
}
