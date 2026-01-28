import java.util.*;

public class Calculator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operator:");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+' : System.out.println("SUM:"+(a+b));
                     break;
            case '-' : System.out.println("SUBTRACTION:"+(a-b));
                     break;
            case '*' : System.out.println("MULTIPLY:"+(a*b));
                     break;
            case '/' : System.out.println("DIVIDE:"+(a/b));
                     break; 
            case '%' : System.out.println("MODULO:"+(a%b));
                     break;                      
            default: System.out.println("INVALID INPUT");                 
        }
    }
}