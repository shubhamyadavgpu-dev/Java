public class Binary_Search {
    public static int Search(int marks[]){
     int key = 14;
     for(int i =1; i < marks.length ; i++ ){
         if (key == marks[i]){
           return i;
         }
     }
     return -1;
    }
    public static void main (String args[]){
       int marks[] = {11,12,13,14,15};
      System.out.println("Key is found at index : "+Search(marks));
    }
}
