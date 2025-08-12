package DSA;

public class ReformatPhoneNo {

    public static void main(String[] args) {
        String str = "123 4-567";
        int i=0;
        StringBuilder sb = new StringBuilder();

        str = str.replaceAll("[\\s-]","");
        sb.append(str);
        StringBuilder ans = new StringBuilder();

        while(str.length()-i>4) { //7 3
            ans=ans.append(str.subSequence(i,i+3)).append("-");
            i+=3;
        }

        if (str.length()-i==2)
            ans.append(str.subSequence(i,i+2)).append("-");
        else if (str.length()-i==3)
            ans.append(str.subSequence(i,i+3)).append("-");
        else
            ans.append(str.subSequence(i,i+2)).append("-").append(str.subSequence(i+2,i+4)).append("-");

        System.out.println(ans.substring(0,ans.length()-1));
    }
}
