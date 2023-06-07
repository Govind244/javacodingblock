/*
A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
Sample Input
10 
4
Sample Output
5 
11 
14 
17 
23 
26 
29 
35 
38 
41

*/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();

        for(int i=1;i<=N1;i++){
            int x = (3*i)+2;
            if(x%N2==0){
                N1++;
            
            }else{
            System.out.println(x);
            }
        }
	}
}
