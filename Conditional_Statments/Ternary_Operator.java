import java.util.*;

public class Ternary_Operator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        String type = (n%2==0)?"Even" : "Odd";
        System.out.println(type + n);
    }
}