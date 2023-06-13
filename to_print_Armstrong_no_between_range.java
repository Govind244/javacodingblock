/*
i/p = 200
o/p = 370
      371
      407
      1634


*/

import java.util.*;  
public class Main  {  
static boolean isArmstrong(int n){  
int temp, digits=0, last=0, ans=0; 
temp = n;       
while(temp>0)    {   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   {     
last = temp % 10;   
ans +=  (Math.pow(last, digits));   
temp = temp/10;   
}  
if(n==ans)   
return true;      
else  
return false;   
}  

public static void main(String args[]) {     
int num1;   
int num2;
Scanner sc= new Scanner(System.in);  
// System.out.print("Enter the starting : ");  
num1=sc.nextInt();  
// System.out.print("Enter the limit: ");  
num2=sc.nextInt();
for(int i=num1; i<=num2; i++)  
if(isArmstrong(i))  
System.out.println(i);  
}   
}  
