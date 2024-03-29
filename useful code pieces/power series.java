import java.util.Scanner;

public class hello{
    public static void main(String[] args) throws InterruptedException {
        double sum=0;

        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i < 7 ;i++){

            sum+=in.nextDouble()*(Math.pow(5,i+1));
        }
        System.out.println((int)sum);
    }


}