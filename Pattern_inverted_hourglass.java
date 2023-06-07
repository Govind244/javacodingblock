/*
5                   5 
5 4               4 5 
5 4 3           3 4 5 
5 4 3 2       2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2 1 0 1 2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2       2 3 4 5 
5 4 3           3 4 5 
5 4               4 5 
5                   5 

*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n=input.nextInt();
        
	
    for(int i=n;i>=0;i--){
        for(int j=n;j>=i;j--){
            System.out.print(j+" ");
        }
        for(int j=i; j>=1;j--){
            System.out.print("  ");
        }
        for(int j=1;j<i;j++){
            System.out.print("  ");
        }
        if(i==0){
            continue;
        }
        for(int j=i;j<=n;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }	
    for(int i=1;i<=n;i++){
         System.out.print(i+" ");
    }
        System.out.println();

    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print(j+" ");
        }
        for(int j=i; j>=1;j--){
            System.out.print("  ");
        }
        for(int j=1;j<i;j++){
            System.out.print("  ");
        }
        if(i==0){
            continue;
        }
        for(int j=i;j<=n;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
	}
}
