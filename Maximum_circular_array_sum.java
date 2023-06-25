/*
You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive numbers.

Sample Input
1
7
8 -8 9 -9 10 -11 12
Sample Output
22
Explanation
Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)

*/
import java.util.*;
public class Program
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();           // no. of testcase
        for(int x=1; x<=p; x++){
            int n = sc.nextInt();       // size of array
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();      // array elements input
            }
            
            int sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += a[i];
	        }       

	        int currmin = a[0], minfar = a[0];
	        int currmax = a[0], maxfar = a[0];

	        // Concept of Kadane's Algorithm
	        for (int i = 1; i < n; i++)
	        {

	        // Kadane's Algorithm to find Maximum subarray sum.
	        currmax = Math.max(currmax + a[i], a[i]);
	        maxfar = Math.max(maxfar, currmax);

	        // Kadane's Algorithm to find Minimum subarray sum.
	        currmin = Math.min(currmin + a[i], a[i]);
	        minfar = Math.min(minfar, currmin);
	        }
	        if (minfar == sum) {
	        // print maxfar;
            System.out.println(maxfar);
	        }

	        // printing the maximum value
        	        //print Math.max(maxfar, sum - minfar);
                    System.out.println(Math.max(maxfar, sum - minfar));
        }       
        }
	
}
