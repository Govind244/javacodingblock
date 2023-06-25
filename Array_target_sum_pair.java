/*
Input Format
The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.

Output Format
Print all the pairs of numbers which sum to target. Print each pair in increasing order.

Sample Input
5
1
3
4
2
5
5
Sample Output
1 and 4
2 and 3

*/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int p = sc.nextInt();
        
        // for(int x=1; x<=p; x++){
            int n = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
		
        int target = sc.nextInt();
         // int target = 5;
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
        // }
	}
}
