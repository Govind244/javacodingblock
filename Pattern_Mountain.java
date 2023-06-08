/*
1                                       1    
1    2                             2    1    
1    2    3                   3    2    1    
1    2    3    4         4    3    2    1    
1    2    3    4    5    4    3    2    1    

*/

// Pattern mountain

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        // int n=4;
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    		for(int i=1;i<=n-1;i++){
            // no.
            for(int j=1;j<=i;j++){
                System.out.print(j+"    ");
            }
            // tab space
            for(int j=n-1;j>=i;j--){
                System.out.print("     ");
            }
            // tab space
            for(int j=n-2;j>=i;j--){
                System.out.print("     ");
            }
            // no.  
            for(int j=i;j>=1;j--){
                System.out.print(j+"    ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            System.out.print(i+"    ");
        }
        for(int i=n-1;i>=1;i--){
            System.out.print(i+"    ");
        }
	}
}
