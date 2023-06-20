// Arrays spiral print clockwise

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();  // rows
        int c = input.nextInt();  // columns
        int arr[][] = new int[r][c];

        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = input.nextInt(); 
              
            }
        }
        
        

        int sr=0, sc=0, er=r-1, ec=c-1; 
        while(sc<=ec && sr<=er){ 
            for(int i=sr; i<=er; i++){                      // row side traverse     
                System.out.print(arr[i][sc] + ", ");        // print column
            }
            sc++;

            for(int j=sc; j<=ec; j++){                      // column side traverse
                System.out.print(arr[er][j] + ", ");        // print row
            }
            er--;

            for(int i=er; i>=sr; i--){
                System.out.print(arr[i][ec] + ", ");
            }
            ec--;

            for(int j=ec; j>=sc; j--){
                System.out.print(arr[sr][j] + ", ");
            }
            sr++;
           
        }
        System.out.print("END ");
	}
}
