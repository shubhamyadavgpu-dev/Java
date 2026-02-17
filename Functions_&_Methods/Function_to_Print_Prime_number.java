public class Function_to_Print_Prime_number {
   public static boolean isprime(int n){
    if (n <= 1)
     return false;   // ← yahi galti thi

    for(int i = 2 ; i <= Math.sqrt(n); i++ ){
        if (n%i == 0){
            return false;
        }
    }
    return true ; 
}

    public static void Prime(int n){
        for(int i = 2 ; i <= n; i++ ){
            if (isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        Prime(20);
        }
}