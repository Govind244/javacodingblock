import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();         // size of array
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf(a[j][i]+" ");
            }
            System.out.println();
        }
	}
}
