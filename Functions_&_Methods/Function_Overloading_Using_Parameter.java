public class Function_Overloading_Using_Parameter {
    public static int Sum(int a , int b){
        return a + b ;
    }
    public static int Sum(int a , int b , int c){
    return a + b + c;
    }
    public static void main (String args[]){
     System.out.println("Sum of two numbers : " + Sum(3,4)) ;
     System.out.println("Sum of three numbers : " + Sum(3,2,2)) ;
    }
}