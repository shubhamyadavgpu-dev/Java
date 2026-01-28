import java.util.*;

public class Type_Conversion {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        float a = 12.34f;
        int b = (int)a;//explicit type conversion
        System.out.println("Float a = "+a);
        System.out.println("Int b = "+b);
        char ch = 'A';
        int n = ch;
        System.out.println(n);
    }
}