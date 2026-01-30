import java.util.*;

public class Prime_number {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        if ( n >= 2 ){
        int c =0;
        for(int i = 1 ; i <= n ; i++){
         if (n%i == 0){
            c = c+1;
            }   
        }
        if (c == 2) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }
        }
        else {
            System.out.println("Not a Prime Number");
        }
    }
}