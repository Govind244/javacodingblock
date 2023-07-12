/*
Sample Input
5
3
5
6
9
78
6
Sample Output
2
Explanation
Array = {3, 5, 6, 9, 78}, target number = 6 . Index of number 6 in the given array = 2. Write Binary search to find the number in given array as discuss in the class


*/
import java.util.*;
public class Main
{   
    public static int binarySearch(int a[], int element){
        int l=0, r=a.length-1;          // left and rightmost element

        while(l<=r){
            int mid = (l+r)/2;
            if(a[mid] == element){
                return mid; 
            }else if(a[mid] < element){
                l=mid+1;

            }else{
                r=mid-1;
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();           // size of array
        // int a[] ={3, 5, 6, 9, 78};
        int a[] = new int[x];
        for(int i=0; i<x; i++){
            a[i] = sc.nextInt();
        }
        // int element = 6;
        int element = sc.nextInt();     // element of array to search

        int n =  binarySearch(a, element);
        System.out.println(n);
    }
}
