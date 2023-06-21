/*
i/p=
Enter the size of array
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

o/p=
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9 13 
*/

import java.util.*;
public class array2{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the size of array");
		int n = sc.nextInt();   
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			int s=0;
			int e=n-1;
			
			while(s<e) {
				int temp = a[i][s];
				a[i][s] = a[i][e];
				a[i][e] = temp;
				s++;
				e--;
			}
			
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(i<j) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
				
	}
}
