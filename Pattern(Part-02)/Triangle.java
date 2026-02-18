public class Triangle {
    public static void Tr (int n){
    for(int i = 1 ; i <= n ; i++){    //outer loop
        for(int j = 1 ; j <= i ; j++){  //space
              int k = i + j ;
              if (k%2 == 0){
                System.out.print(1);
              }
              else {
                 System.out.print(0);
              }
             }
            System.out.println();
        }
    }
    public static void main(String args[]){
    Tr(5);
    }
}