/*
Output Format
Print the balanced parentheses strings with every possible solution on new line.

Sample Input
2
Sample Output
()() 
(())
*/

import java.util.*;
public class Main
{
    public static void genParenthesis(int cc,int oc, int n, String out){
        if(oc==n && cc==n){
            System.out.println(out);
            return;
        }

        if(oc > cc){
            genParenthesis(cc+1,oc, n, out+')');
        }

        if(oc < n){
            genParenthesis(cc,oc+1, n, out+'(');
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		genParenthesis(0, 0, n, "");
	}
}
