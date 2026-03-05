public class kadanes_Algorithm {
    public static void Kadanes(int marks[]){
       int currsum = 0 ;
       int maxsum = Integer.MIN_VALUE ;

       for(int i = 0 ; i <marks.length ; i++){
         currsum = currsum + marks[i];
         if (currsum < 0){
            currsum = 0 ;
         }
         maxsum = Math.max(maxsum, currsum);
       }
       System.out.println("Maxsum : "+maxsum);
    }
    public static void main(String args[]){
    int marks[] = {-2,-3,4,-1,-2,1,5,-3};
    Kadanes(marks);
    }
}
