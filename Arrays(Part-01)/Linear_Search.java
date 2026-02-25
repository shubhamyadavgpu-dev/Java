public class Linear_Search {
    public static int linear(int arr[] , int key){
     for(int i = 0 ; i < arr.length ; i++){
        if (arr[i] == key){
            return i ;
        }
     }
     return -1 ;
    }
    public static void main (String args[]){
      int arr[] = {11,12,13,14,15,16,17,18,19,20} ;
      int key = 156;
      int index = linear(arr,key);
      if (index == -1){
        System.out.println("Key Not Found");
      }
      else{
        System.out.println("key is found at index : "+index);
      }
    }
}
