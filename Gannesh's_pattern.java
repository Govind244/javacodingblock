/*
Sample Input
7
Sample Output

*  ****
*  *
*  *
*******
   *  *
   *  *
****  *

*/
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		// int n=9;
        // first line
        System.out.print("*");
 
        for(int i=0; i<n/2-1; i++){
            System.out.print(" ");
        }
 
        for(int i=0;i<n/2+1; i++){
            System.out.print("*");
            
        }
        System.out.println();
  
        // upper half
        for(int i=0; i<n/2-1; i++){
            // System.out.println("*");
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }

            for(int j=0; j<n/2-1; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        // middle line
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();

        // lower half
        for(int i=0; i<n/2-1; i++){
            for(int j=0; j<n/2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<1; j++){
                System.out.print("*");
            }

            for(int j=0; j<n/2-1; j++){
                System.out.print(" ");
            }
            
            for(int j=0; j<1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // last line
        for(int i=0; i<n/2+1; i++){
            System.out.print("*");
        }

        for(int i=0; i<n/2-1; i++){
            System.out.print(" ");
        }
        
        System.out.println("*");



	}
}
