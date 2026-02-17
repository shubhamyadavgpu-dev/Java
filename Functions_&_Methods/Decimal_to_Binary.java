public class Decimal_to_Binary {
    public static void DeciBina(int n){
     int pow = 0;
     int bin = 0 ;
     int r = n ;
     while(n>0){
        int rem = n % 2;
         bin = bin + (rem * (int)Math.pow(10,pow));
         pow++;
         n = n/2;
     }
     System.out.println("Decimal (" + r + ")  to binary is : "+bin);
    }
    public static void main (String args[]){
     DeciBina(5);
    }
}