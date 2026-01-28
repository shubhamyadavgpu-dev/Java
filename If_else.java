import java.util.*;

public class If_else {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("You can vote");
        }
        if (age<17 && age>=13){
            System.out.println("Teenager");
        }
        else{
            System.out.println("You cannot vote");
        }
    }
}