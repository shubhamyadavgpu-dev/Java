public class Subarray {
    public static void Subarr(int marks[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            int in = i;
            for (int j = i; j < marks.length; j++) {
                int out = j;
                currsum = 0;
                for (int k = in; k <= out; k++) {
                    // int sum = in + out ;
                    // System.out.println("sum is"+sum);

                    currsum = currsum+marks[k];
                }
                 System.out.println(currsum);
               if (currsum > maxsum) {
                   maxsum = currsum;
                }
               // System.out.println();
            }
           // System.out.println();
        }
          System.out.println("Maximum sum is: " + maxsum);
    }

    public static void main(String[] args) {
        int marks[] = { 2, 4, 6, 8, 10 };
        Subarr(marks);
    }
}
