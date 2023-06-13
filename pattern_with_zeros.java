/*
n=6;
1    
2    2    
3    0    3    
4    0    0    4    
5    0    0    0    5    
6    0    0    0    0    6  

*/

import java.util.*;
public class Program
{
    public static void main(String[] args) {
		// int n=5;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(i+"    ");

            for(int j=i-2;j>=1;j--){
                System.out.print("0    ");
            }
            if(i!=1){
                System.out.printf(i + "    ");
            }
            System.out.println();
        }
        
	}
}
