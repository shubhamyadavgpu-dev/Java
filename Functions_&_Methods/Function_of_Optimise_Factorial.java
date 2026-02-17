public class Function_of_Optimise_Factorial {
    public static boolean isFact(int n){
        for(int i = 2 ; i <= Math.sqrt(n); i++ ){
            if (n%i == 0){
                return false;
            }
        }
        return true ; 
    }
    public static void main(String args[]){
        System.out.println(isFact(7));
        }
}