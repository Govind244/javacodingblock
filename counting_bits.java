/*
Sample Input
5
Sample Output
0 1 1 2 1 2
Explanation
Number of 1's for :
i=0 is 0
i=1 is 1
i=2 is 1
i=3 is 2
i=4 is 1
i=5 is 2
*/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // int x = 5;
        int x = sc.nextInt();
        // int count=0;
        for(int i=0; i<=x; i++){
            // int m=1;
            System.out.print(count(i)+ " ");
         }
	}

    public static int count(int n){ 
        int count=0;   
            while(n>0){

            if((n&1)>0){
                count++;
            }
               n=(n>>1);
            }
            return count;
    }        
       
}
