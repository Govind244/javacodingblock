/*
5 4 3 2 1 0 1 2 3 4 5 
  4 3 2 1 0 1 2 3 4 
    3 2 1 0 1 2 3 
      2 1 0 1 2 
        1 0 1 
          0 
        1 0 1 
      2 1 0 1 2 
    3 2 1 0 1 2 3 
  4 3 2 1 0 1 2 3 4 
5 4 3 2 1 0 1 2 3 4 5 
*/


import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

		for(int i=n;i>=0;i--){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

       
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
	}
}
