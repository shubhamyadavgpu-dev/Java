public class Max_Subarray_Sum{
    public static void max(int marks[]){
    int currsum = 0 ;
    int maxsum = Integer.MIN_VALUE ;

    for(int i = 0 ; i < marks.length ; i++){
        int in = i ;
        for(int j = i ; j < marks.length ; j++){
            int out = j ;
            currsum = 0;
           for(int k = in ; k <= out ; k++){
           currsum = currsum + marks[k];
           }
           if (maxsum < currsum){
            maxsum = currsum;
           }
        System.out.println(currsum);
        }
    }
    System.out.println("Maxsum is : "+maxsum);
    }
    public static void main (String args[]){
    int marks[] = {2,4,6,8,10};
    max(marks);
    }
}