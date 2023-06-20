// Arrays spiral print clockwise

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();  // rows
        int c = input.nextInt();  // columns
        int arr[][] = new int[r][c];

        // int val=1;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = input.nextInt(); 
                // val++;
            }
        }
        
        // for(int i=0; i<r; i++){
        //     for(int j=0; j<c; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int sr=0, sc=0, er=r-1, ec=c-1; 
        while(sc<=ec && sr<=er){
            for(int i=sc; i<=ec; i++){    // column side
                System.out.print(arr[sr][i] + ", ");
            }
            sr++;

            for(int j=sr; j<=er; j++){      // rows side
                System.out.print(arr[j][ec] + ", ");
            }
            ec--;

            if(sr <= er ){    
            for(int i=ec; i>=sc; i--){     
                System.out.print(arr[er][i] + ", ");
            }
            er--;
            }

            if(sc <= ec){
            for(int j=er;j>=sr;j--){
                System.out.print(arr[j][sc] + ", ");
            }
            sc++;
            }
        }
        System.out.print("END ");
	}
}
