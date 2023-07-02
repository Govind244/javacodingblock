/*
Sample Input
IAmACompetitiveProgrammer
Sample Output
I
Am
A
Competitive
Programmer

*/
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        int i=0;
        while(i<s.length()){
            int j=i+1;
            System.out.print(s.charAt(i));
            while(j<s.length() && s.charAt(j)>='a' && s.charAt(j)<='z'){
                System.out.print(s.charAt(j));
                j++;
            }   
            i=j;
            System.out.println();
        }
    }
}
