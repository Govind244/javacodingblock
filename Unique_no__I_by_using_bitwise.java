/*
We are given an array containg n numbers. All the numbers are present twice except for one number which is only present once. Find the unique number without
taking any extra spaces and in linear time. ( Hint - Use Bitwise )

Sample Input
7
1 1 2 2 3 3 4 
Sample Output
4
*/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           // size of array
        int x[] = new int[n];            
        // int x[] = {7,9,6,8,3,7,8,6,9};
        for(int i=0; i<n; i++){   
            x[i] = sc.nextInt();        // input array elements  
        }    
        int ans = 0;
        for(int i=0; i<x.length; i++){        
        ans = ans ^ x[i];
        // System.out.println(ans);
        }
        System.out.println(ans);
        
	}
}
