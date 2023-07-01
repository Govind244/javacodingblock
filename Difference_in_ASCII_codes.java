/*
Take as input S, a string. Write a program that inserts between each pair of characters the difference between their ascii codes and print the ans.
Sample Input
acb
Sample Output
a2c-1b
*/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
		// String s = "acb";
        int m=0;
        int n=1;
        System.out.print(s.charAt(m));
        for(int i=0;i<s.length()-1;i++){
            // System.out.print(s.charAt(i));
            int k = s.charAt(n)-s.charAt(m);
            System.out.print(k);
            System.out.print(s.charAt(n));
            m=n;
            n=m+1;
        }
	}
}
