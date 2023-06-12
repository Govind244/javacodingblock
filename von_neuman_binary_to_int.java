/*
i/p = 1001
o/p = 9
*/

import java.util.*;
public class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for(int i=1;i<=p;i++){
		String s = sc.next();
        int x= Integer.parseInt(s,2);  
        System.out.println(x);
	}
    }
}
