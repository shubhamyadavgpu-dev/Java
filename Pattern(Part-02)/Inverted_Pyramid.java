public class Inverted_Pyramid {
    public static void Pyramid (int n){
    for(int i = 1 ; i <= n ; i++){    //outer loop
        for(int j = 1 ; j <= n-i+1 ; j++){  //space
           System.out.print(j + " ");
        }
    //     for(int j =1 ; j <= i ; j++){
    //         System.out.print("*");
    //     }
         System.out.println();
       }
    }
    public static void main(String args[]){
    Pyramid(5);
    }
}