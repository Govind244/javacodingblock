/*
Sample Input
2
12345
12134

Sample Output
Yes
No

Explanation
1 + 3 + 5 = 9 which is divisible by 3
1 + 1 + 3 = 5 which is NOT divisible by 3 and 2+4 = 6 which is not divisble by 4.
*/

import java.util.*;
public class Pattern1
{
    public static void main(String[] args) {
//		 int n=12345;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of car numbers.....");
        int p = sc.nextInt();

        System.out.println("Enter car's numbers.....");
        for(int i=0;i<p;i++){
            int n=sc.nextInt();
        
        
        int sumodd=0;
        int sumeven=0;
        while(n>0){
            int x=n%10;
            if(x%2==0){
                sumeven+=x;
            }else{
                sumodd+=x;
            }
            n/=10;
        }
//        System.out.println(sumodd);
//        System.out.println(sumeven);
        
        if(sumodd % 3 == 0  || sumeven % 4 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
    }
}
