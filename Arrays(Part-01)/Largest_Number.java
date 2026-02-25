import java.util.*;

public class Largest_Number {
    public static void Largest(int student[]){
        int lar = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i = 0 ; i < student.length ; i++){
           if (lar <= student[i]){
            lar = student[i];
           }
            if (small >= student[i]){
            small = student[i];
           }
        }
         System.out.println("Largest from array is : " + lar);
         System.out.println("Smallest from array is : " + small);
    }
    public static void main (String args[]){
        int student[] = {34,56,67,45,39,7,9};
        Largest(student);
    }
}
