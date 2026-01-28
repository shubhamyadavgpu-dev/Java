import java.util.*;

public class Greatest_3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if (A>=B && A>=C){
           System.out.println("A is largest :" + A );
        }
        else if (B>=A && B>=C){
           System.out.println("B is largest :" + B );
        }
        else {
           System.out.println("C is largest :" + C );
        }
    }
}