public class Trapping_Rainwater {
    public static void Rainwater(int marks[]) {
        int n = marks.length;

        // calculate leftmax boundary 
        int leftmax[] = new int [n];
        leftmax[0] = marks[0];
        for(int i = 1 ; i <n; i++){
            leftmax[i] = Math.max(marks[i],leftmax[i-1]);
        }

        //Calculate rightmax boundary
        int rightmax[] = new int[n];
         rightmax[n-1] = marks[n-1];
         for(int i = n-2 ; i >=0; i--){
            rightmax[i] = Math.max(marks[i],rightmax[i+1]);
         }

         int trappedwater = 0;
         for(int i = 0 ; i <n ; i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-marks[i];
         }
         System.out.println("Trapped water is :"+trappedwater);
          }

    public static void main(String args[]) {
        int marks[] = { 4, 2, 0, 6, 3, 2, 5 };
        Rainwater(marks);
    }
}
