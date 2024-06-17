/*
input = 4545
o/p = 4444    

this sol. will remove leading '0' to none value 
i/p = 02560
o/p = 2430

*/

import java.util.*;
public class Main
{   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
    	// int n=4545;
        int rem=0;
        int mul=1;
        int num=0;
        while(n>9){
            rem=n%10;
            if(rem>=5){
            num=num+(9-rem)*mul;
            }else{
                num=num+rem * mul;
            }
            mul=mul*10;
            n/=10;
        }
        if(n>=5 && n!=9){
            num = num + (9-n)*mul;
        }else{
            num = num + (n)*mul;
        }
        System.out.println(num);
	}
}




/* other way
this sol. will convert leading '0' to 9 
i/p = 02560
o/p = 92430


*/

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        
        for(int i=0;i<a.length; i++){
            if(a[i] > '4'){
                a[i] = (char)('9'-a[i]+'0');
            }
            if(a[0]=='0'){
                a[0]='9';
            }
        }
            System.out.println(a);
    }
}


