/*
Take as input S, a string. Write a function that replaces every even character with the character having just higher ASCII code and every odd character with the character having 
just lower ASCII code. Print the value returned.
Sample Input
abcg
Sample Output
badf
*/
import java.util.*;
public class Main
{

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";                      // result
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                r+=(char)(s.charAt(i)+1);
            }
            else{
                r+=(char)(s.charAt(i)-1);
            }
        }
    System.out.println(r);
}
}

