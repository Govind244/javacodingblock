/*
1    
1    1    
1    2    1    
1    3    3    1    
1    4    6    4    1 

*/
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
		int[][] a=new int[n][];
        for(int i=0;i<n;i++){
            a[i]=new int[i+1];   // not 
            a[i][0]=1;
            for(int j=1;j<i;j++){
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
            a[i][i]=1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
	}
}
