import java.util.*;

public class Factorial {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int fact = 1;
        for(fact = 1; n>=1;n--){
            fact = fact*n;
        }
        System.out.println("Factorial = "+fact);
    }
}   