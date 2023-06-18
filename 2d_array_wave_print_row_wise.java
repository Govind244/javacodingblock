/*
Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END
*/

import java.util.*;
public class Program
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();   // no. of rows
        int c = sc.nextInt();       // no. of columns
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        arr[i][j]= sc.nextInt();

        for(int i=0;i<r;i++){
            if(i%2==0){
               for(int j=0;j<c;j++){
                System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int j=c-1;j>=0;j--){
                System.out.print(arr[i][j] + " ");
                }
            }
        }    
        System.out.print("END");
        }
	}

