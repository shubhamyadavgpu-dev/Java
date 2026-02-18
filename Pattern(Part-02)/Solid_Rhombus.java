public class Solid_Rhombus{
    public static void Rhombus(int n){
     for(int i = 1 ; i <= n ; i++){
        // space
       for(int s = 1 ; s <= (n-i) ; s++){
            System.out.print(" ");
       }
       for(int j = 1 ; j <= n ; j++){
        System.out.print("*");
       }
        System.out.println();
     }
    }
    public static void main(String args[]){
   Rhombus(7);
    }
}