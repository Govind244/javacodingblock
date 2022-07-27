                                //Bubble Sort


//import java.util.*;
    public class sorting1{
        public static void printArray(int arr[]){
          for(int i=0; i<=arr.length; i++){    // 'arr.length-1'  help us to remove exception error 
            System.out.print(arr[i]+ " ");
          }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,8,1,3,2};

        //complexity = O(N^2)  this is not a good complexity to compile our data
        // sorting
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
        printArray(arr);
        }
}

//code from class

/*import java.util.*; 
class Sorting1S {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
 
   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};
 
       //bubble sort
       for(int i=0; i<arr.length-1; i++) {
           for(int j=0; j<arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   //swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
 
       printArray(arr);
   }
}*/

/* on compile above both codes
1 2 3 7 8 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at sorting1.printArray(sorting1.java:5)
        at sorting1.main(sorting1.java:25)
        */


                                // Selection sort

/*import java.util.*;
  public class sorting1{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,8,1,3,2};
        //selection sort 
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;

                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
 }*/

                           // insertion sort

/*import java.util.*;
    public class sorting1{
        public static void printArray(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public static void main(String args[]){
            int arr[] = {7,8,1,3,2};
            // insertion
            for(int i=1; i<arr.length; i++){
                int current = arr[i];
                int j = i-1;
                while(j<=0 && current<arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                //placement
                arr[j+1] = current;
            }
            printArray(arr);
        }
    }                           */