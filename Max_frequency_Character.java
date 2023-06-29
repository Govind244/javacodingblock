/*
Sample Input
aaabacb
Sample Output
a
Explanation
For the given input string, a appear 4 times. Hence, it is the most frequent character.
*/
import java.util.*;
public class Main
{

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int freq[] = new int[26];
        int max = 0;
        int r = 0;                          // result
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            if(freq[s.charAt(i)-'a']>max){
                max = freq[s.charAt(i)-'a'];
                r = s.charAt(i)-'a';
            }
        }
        // System.out.println(r);
        // System.out.println(max);
        System.out.println((char)(r+'a'));
        // for(int i=0; i<25; i++){
        //     System.out.println(freq[i]);
        // }
    }
}
