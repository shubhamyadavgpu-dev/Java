public class Reverse {
    public static void main (String args[]){
        int n = 1234;
        int rev = 0;
        while (n>0){
          //  rev = n % 10 ;
          //  or
            int last = n % 10;
            rev = rev*10 + last;  // all reverse value store in rev
            n = n / 10;
         //   System.out.print(rev);
        }
        System.out.print(rev);
    }
}