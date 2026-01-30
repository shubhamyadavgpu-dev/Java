import java.util.*;

public class Sum {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=n){
            sum = sum + i;
            i = i+1;
        }
        System.out.println("Sum of first " + n + " natural numbers is : " + sum);
    }
}