/*
Sample Input
7
Sample Output
 1******
 12*****
 123****
 1234***
 12345**
 123456*
 1234567
 
*/

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
