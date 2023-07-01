/*
We are given an array containg n numbers. All the numbers are present twice except for two numbers which are present only once.
Find the unique numbers in linear time without using any extra space. ( Hint - Use Bitwise )

Sample Input
4
3 1 2 1
Sample Output
2 3
Explanation
Smaller number comes before larger number

*/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        // int a[] = {3, 1, 2, 1};
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans = 0;
        for(int i=0; i<a.length; i++){
            ans=ans^a[i];
        }
        // System.out.println(ans);

        int p = 0;                      // for position

        while(ans>0){
            if((ans&1)==1){
                break;
            }
            ans=ans>>1;
            p++;

        }
        // System.out.println(p);

        int x = 1<<p;                   // generating of no. from pos=1 place
        // System.out.println(x);

        int u1=0, u2=0;
        for(int i=0;i<a.length;i++){
            if((a[i]&x)==0){
                u1=u1^a[i];

            }else{
                u2=u2^a[i];
            }
        }
        System.out.println(u1+" "+u2);
    }
}
