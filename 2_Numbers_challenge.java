/*
You are given an array A, consisting of n positive integers a1,a2,…,an, and an array B, consisting of m positive integers b1,b2,…,bm. Choose some element a of A and some element b of B
such that a+b doesn't belong to A and doesn't belong to B. For example, if A=[2,1,7] and B=[1,3,4], we can choose 1 from A and 4 from B, as number 5=1+4 doesn't belong to A and doesn't
belong to B. However, we can't choose 2 from A and 1 from B, as 3=2+1 belongs to B. It can be shown that such a pair exists. If there are multiple answers, print any. Choose and print any 
such two numbers.

Output Format
Output two numbers a and b such that a belongs to A, b belongs to B, but a+b doesn't belong to nor A neither B.

Sample Input
1
20
2
10 20
Sample Output
20 20 

*/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        for(int i=0; i<n1; i++){
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        for(int i=0; i<n2; i++){
            b[i] = sc.nextInt();
        }   

        int x;

        for(int i=0; i<n1; i++){
            for(int j=0; j<n1-1; j++){
                if(a[j]>=a[j+1]){
                   x=a[j];
                   a[j]=a[j+1];
                   a[j+1]=x;
                }
            }
        }

        for(int i=0; i<n2; i++){
            for(int j=0; j<n2-1; j++){
                if(b[j]>=b[j+1]){
                   x=b[j];
                   b[j]=b[j+1];
                   b[j+1]=x;
                }
            }
        }

        System.out.print(a[n1-1] + " " + b[n2-1]);
	}
}
