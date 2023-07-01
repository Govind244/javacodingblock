/*
Prateek Bhayia likes to play with bits. One day Prateek bhayia decides to assign a task to his student Sanya. You have help Sanya to complete this task. 
Task is as follows - Prateek Bhayia gives Q queries each query containing two integers a and b. Your task is to count the no of set-bits in for all numbers between a and b (both inclusive)

Sample Input
2
1 1
10 15
Sample Output
1
17

*/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();             // no. of testcases
        while(n--!=0){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=0;
        for(int j=a; j<=b; j++){
            ans+=bc(j);
        }
        System.out.println(ans);
        }
        }    
        public static int bc(int x){        // counting the no. of 1's
            int m = 0;
            while(x!=0){
                int c=x&1;
                if(c==1){
                    m++;
                }
                x=x>>1;
            }
            return m;
        }
	
}
