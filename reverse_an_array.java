/*
i/p = 5
0
1
2
3
4

o/p = 4
3
2
1
0
*/

import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the no. of element in array....");
		int n = sc.nextInt();
		int[] a = new int[n];
        int p = a.length;
        // int[] x = new int[n];
        
		for(int i=0;i<p;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<p/2;i++) {
            // x[n-i-1] += a[i];
            int temp = a[i];
            a[i] = a[p-1-i];
            a[p-1-i]=temp;
        }	
        
        for(int i=0;i<p;i++){
            System.out.print(a[i]+ " ");
        }
	}

}
