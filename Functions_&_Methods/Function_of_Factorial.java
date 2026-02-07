public class Function_of_Factorial {
    public static int  Fact(int a){
    int fact = 1;
      while(a>=1){
        fact = fact * a ;
        a--;
        }
    return fact ;
    }
    public static void main (String args[]){
        int n = 6 ;
       System.out.println("Factorial= "+Fact(n));
    }
}