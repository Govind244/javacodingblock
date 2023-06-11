/*
input = 4545
o/p = 4444
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
