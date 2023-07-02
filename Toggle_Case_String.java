/*
Sample Input
abC
Sample Output
ABc
Explanation
Toggle Case means to change UpperCase character to LowerCase character and vice-versa.

*/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // String s = "AbC";
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                // System.out.println("upper");
                int x = (int)s.charAt(i)+32;
                System.out.print((char)x);

            }else{
                // System.out.println("lower");
                int x = (int)s.charAt(i)-32;
                System.out.print((char)x);
            }
        }
	}
}
