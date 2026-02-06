public class Function_of_Add {
    public static int hello (int a , int b){
      int sum = a + b;
      return sum;
    }
    public static void main (String args[]){
      int a = 5;
      int  b = 4;
      int sum = hello(a, b);
      System.out.println("Sum is : "+sum);
    }
}