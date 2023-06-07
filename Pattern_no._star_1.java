/*
1 2 3 4 5 
1 2 3 4 * 
1 2 3 * * * 
1 2 * * * * * 
1 * * * * * * * 

*/

import java.util.*;
public class Main
{
    
    public static void main(String[] args) {
        // int n=5;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
		for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            for(int j=i;j<=n-2;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
