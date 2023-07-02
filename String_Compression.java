/*
Sample Input
aaabbccds
Sample Output
a3b2c2d1s1
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice and 'd and 's' occurred only once.

*/
import java.util.*;
public class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String s = "aaabbccds";
        String ans="";
        int i=0;
        while(i<s.length()){
            int count=0;
            ans=ans+s.charAt(i);
            int j=i;
            while(j<s.length() && s.charAt(j)==s.charAt(i)){
                count++;
                j++;
            }
            ans+=Integer.toString(count);
            i=j;
        }    
        System.out.println(ans);
	}
}


/*
Sample Input
aaabbccds
Sample Output
a3b2c2ds
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' 
is repeated twice. But, 'd' and 's' occurred only once that's why we do not write their occurrence.
*/

import java.util.*;
public class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String s = "aaabbccds";
        String ans="";
        int i=0;
        while(i<s.length()){
            int count=0;
            ans=ans+s.charAt(i);
            int j=i;
            while(j<s.length() && s.charAt(j)==s.charAt(i)){
                count++;
                j++;
            }
            if(count>1){
            ans+=Integer.toString(count);
            }
            i=j;
        }    
        System.out.println(ans);
	}
}
