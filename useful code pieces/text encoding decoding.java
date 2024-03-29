public class Main{
    public static void main(String[] args) {
        telegram ali = new telegram("abc");
        ali.Encode(1);
        ali.Decode(2);
        System.out.println(ali.message);
    }

}

class telegram{
    String message;
    public telegram(String a){
        this.message = a;
    }
    public void Encode( int step){
        String temp = "";
        int num;
        step = step % 26;
        for(int i = 0 ; i < message.length();i++){
            num = (int)message.charAt(i);
            num += step;
            num -= 96;
            num = num %26;
            num += 96;
            temp+=(char)num;
        }
        this.message = temp;
    }
   public void Decode(int step){
       String temp = "";
       int num;
       step = step % 26;
       for(int i = 0 ; i < message.length();i++){
           num = (int)message.charAt(i);
           num -= (step+96);
           if(num<= 0){
               num+=26;
           }
           num += 96;
           temp+=(char)num;
       }
       this.message = temp;
    }
}