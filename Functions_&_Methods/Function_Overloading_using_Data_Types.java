public class Function_Overloading_using_Data_Types {
    public static int sum(int a , int b){
        return a + b ;
    }
    public static float sum(float a , float b){
        return a + b ;
    }
    public static void main (String args[]){
    System.out.println("Sum of Integer : " + sum(3,5));
    System.out.println("Sum of Float : " + sum(3.5f,4.5f));
  }
    }