/*
i/p = 102
o/p = 152
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='0'){
				ans=ans+"5";
			}
			else{
				ans=ans + s.charAt(i);
			}
		}
		System.out.println(ans + " ");
    }
}

