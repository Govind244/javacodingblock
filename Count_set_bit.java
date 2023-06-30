/*
Sample Input
3
5
4
15
Sample Output
2
1
4
Explanation
Convert Binary to Decimal first and then count number of 1's present in all digits.
*/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();			// no. of testcases
        for(int i=0; i<n; i++){
        int x = sc.nextInt();           // number
        int count  = 0;
        while(x>0){
            if((x&1) == 1){
                count++;
            }
            x=x>>1;
        }
        System.out.println(count);
        }
	}
}
