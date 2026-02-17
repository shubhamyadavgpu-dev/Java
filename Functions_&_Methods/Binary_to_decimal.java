class Binary_to_decimal {
    public static void BinDec(int n){
        int k = n;
        int pow = 0 ;
        int dec = 0 ;
        while(n>0){
        int ld = n % 10 ;
        dec = dec + (ld*(int)Math.pow(2,pow));
        pow++;
        n = n/10;
        }
        System.out.println("Binary of "+ k + " to decimal is : "+dec);
    }
    public static void main(String args[]){
      BinDec(1110);
    }
}