/*
A character (ch) Write a function that returns ‘U’, if it is uppercase; ‘L’ if it is lowercase and ‘I’ otherwise. Print the value returned.
'L' (if ch is lower-case) 'U' (if ch is upper-case) 'I' (otherwise)
Sample Input
s
Sample Output
L

*/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char ch = '?';
        char ch = sc.next().charAt(0);
        // boolean b1 = Character.isUpperCase(ch);
        // boolean b2 = Character.isLowerCase(ch);
        if(Character.isUpperCase(ch)){
            System.out.println("U");
        }else if(Character.isLowerCase(ch)){
            System.out.println("L");
        }else{
            System.out.println("I");
        }
	}
}
