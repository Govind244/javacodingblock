/*
i/p  = 370
o/p = true
*/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        // int number = 370;
        int originalNumber, remainder, result = 0;

        originalNumber = number;
        int temp=number;

        int d=0; // no of digits
        // // int ans=0;
        while(temp!=0){
            int rem = temp%10;
            d++;
            temp/=10;
        }
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, d);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
