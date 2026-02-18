public class Floyd_Triangle {
    public static void Floyd (int n){
    int num = 1;
    for(int i = 1 ; i <= n ; i++){    //outer loop
        for(int j = 1 ; j <= i ; j++){  // inner loop
           System.out.print(num + " ");
           num++;
        }
        System.out.println();
      }
    }
    public static void main(String args[]){
    Floyd(5);
    }
}