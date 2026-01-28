import java.util.*;

public class Income_Tax {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Annual income:");
        int income = sc.nextInt();
        int tax = 0;
        if (income <=500000){
           tax = 0;
        }
        else if (income >500000 && income <= 1000000){
           tax = (int)(0.2*(income-500000));
        }
        else if(income >1000000){
          tax = (int)(0.2*500000+0.3*(income-1000000));
        }
        System.out.println("Your Income tax is:" + tax);
    }
}