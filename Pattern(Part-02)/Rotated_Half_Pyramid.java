public class Rotated_Half_Pyramid {
    public static void Pyramid (int n){
    for(int i = 1 ; i <= n ; i++){    //outer loop
        for(int j = 1 ; j <= n-i ; j++){  //space
           System.out.print(" ");
        }
        for(int k =1 ; k <= i ; k++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void main(String args[]){
    Pyramid(4);
    }
}