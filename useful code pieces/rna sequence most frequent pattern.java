import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       String seq;
       String patt;
       int d;
       Scanner input = new Scanner(System.in);
       seq = input.next();
       patt = input.next();
       d=input.nextInt();
       System.out.println(countOccurrences(seq,patt,d));
    }
    public static int countOccurrences(String sequence, String pattern, int d) {
        int i=0;
        int result =0;
        int step = pattern.length();
        while(!(i+step > sequence.length())){
            if(d >= distance(pattern,sequence.substring(i,i+step))){
                result+=1;
            }
            i+=1;
        }
        return result;
    }
    public static int distance(String s1, String s2) {
        int ans = 0;
        for(int i = 0 ; i < s1.length();i++){
            if(s1.charAt(i) !=s2.charAt(i)) {
                ans+=1;
            }

        }
        return ans;
    }

}
