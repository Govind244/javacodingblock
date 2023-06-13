/*
i/p = 378
o/p = 1

*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(sumPrimeFactor(n)==digitSum(n)){
            System.out.printf("%d", 1);
        } 
        else{
            System.out.printf("%d", 0);
        }
    }
    public static int sumPrimeFactor(int n){
        int i=2,s=0;
        while(n!=1){
            if(n%i==0 && isPrime(i)==true){
                s+=(digitSum(i));
                n/=i;
            }
            else{
                i++;
            }
        }
        return s;
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int digitSum(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n/=10;
        }
        return sum;
    }
}
