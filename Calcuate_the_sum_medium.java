/*
Sample Input
5
1 2 3 4 5
2
1
0
Sample Output
60
*/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int p= sc.nextInt();   // no. of elements in array
        int arr[]=new int[p];
        for(int i=0;i<p;i++){
            arr[i]=sc.nextInt();    // input the elements of array
        }

        int x[] = new int[p];
        int q = sc.nextInt();   // no. of operations
        while(q--!=0){
            int l=sc.nextInt();
            for(int i=0;i<p;i++){ //l=1
                int in=i-l; //0 1 2 3 4
                if(in<0){
                    int add=arr.length+in;
                    x[i]=arr[i]+arr[add];
                  
                }
                else{
                    x[i]=arr[i]+arr[in];
                }
            }
            for(int i=0;i<arr.length;i++){
                arr[i]=x[i];
            }
        }

        int sum=0;
        for(int i : arr){
            sum+=i;
        }
        System.out.println(sum);
	}
}
