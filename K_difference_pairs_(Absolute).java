/*
Given an array of integers and an integer K, you need to find the number of unique K-different pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Input Format
The first line of input consists number of the test cases. The description of T test cases is as follows: The first line of each test case contains the size of the array, the second line has the elements of the array and the third line consists of the difference k.

Constraints
1 ≤ T ≤ 100 1 ≤ N≤ 100 0≤K≤100 0 ≤ A[i] ≤ 10000

Output Format
In each separate line print the number of times difference k exists between the elements of the array.

Sample Input
2
5 
1 5 4 1 2
0
3
1 1 1
0
Sample Output
1
1
*/

// solution

import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // no. of testcases
        for(int x=1;x<=n;x++){
            int p = sc.nextInt();   // size of array
            int a[] = new int[p];
            for(int i=0;i<p;i++){
                a[i]=sc.nextInt();
            }

            int k=sc.nextInt();         // difference
            int count=0;
            for(int i=0; i<a.length; i++){
                for(int j=i+1; j<a.length;j++){
                    if(a[i]>=0 ){
                    if((Math.abs(a[i]-a[j])==k) ){
                        a[i]= -1;
                        a[j]= -1;
                        count++;
                    }
                    }
                }
            }
             System.out.println(count);
            
        }    
    }

}
