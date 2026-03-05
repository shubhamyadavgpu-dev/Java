public class Prefix_Sum {
    public static void Max(int marks[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix [] = new int [marks.length];

        prefix[0] = marks[0];
        for(int i = 1 ; i <prefix.length ; i ++){
            prefix[i] = prefix[i-1] + marks[i];
        }
       for(int i = 0 ; i < marks.length ; i++){
        int in = i;
        for(int j = i ; j < marks.length ; j ++){
          int out = j;

          currsum = in == 0 ? prefix[out] : prefix[out] - prefix[in-1];
          if(maxsum < currsum){
            maxsum = currsum ;
          }
        }
    }
    System.out.println("Max sum : " + maxsum);
    }
    public static void main(String args[]){
   int marks[] = {2,4,6,8,10};
   Max(marks);
    }
}
