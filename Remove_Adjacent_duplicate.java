/*
Sample Input
aabccba
Sample Output
abcba

*/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        int j=1;
        while(j<s.length()){                //"sb.size" is also correct
            if(sb.charAt(i)!=sb.charAt(j)){
                i++;
                sb.setCharAt(i, sb.charAt(j));
            }
            j++;
        }
        System.out.println(sb.substring(0,i+1));
	}
}
