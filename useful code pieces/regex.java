import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hello{
    public static void main(String[] args){
        String str;
        String pattern;
        //.................
        while (true){
            System.out.println("wanna continue?");
            str = input();
            if(str.equals("yes")){
                System.out.println("which pattern you wanna check?");
                pattern = input();
                System.out.println("got it! what is your input ?");
                str = input();
                System.out.printf("your answer is :");
                System.out.println(pattern_checker(pattern,str));
            }
            else{
                System.out.println("always having fun hanging out with ya. bye");
                break;
            }
        }
        System.exit(0);
    }
    public static String input(){
        String temp;
        Scanner inp = new Scanner(System.in);
        temp = inp.nextLine();
        return temp;
    }
    public static boolean pattern_checker(String a, String b){
        Pattern olgoo = Pattern.compile(a);
        Matcher build = olgoo.matcher(b);
        return build.find();
    }
}