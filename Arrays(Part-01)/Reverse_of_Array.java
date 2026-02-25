public class Reverse_of_Array{
    public static void rev(int marks[]){
    int start = 0;
    int end = marks.length-1;
   
     
    while(start < end){
        int temp = marks[start] ;
        marks[start] = marks[end];
        marks[end] = temp;

        start++;
        end--;
       }
    }
    public static void main(String args[]){
    int marks[] = {2,4,6,8,10};
    rev(marks);

    for(int i = 0 ; i < marks.length ; i++){
        System.out.print(marks[i]+ " ");
       }
    }
}