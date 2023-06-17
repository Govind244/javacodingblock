/*
i/p = 5  // no. of elements 
      2
      4
      6
      9
      17
      17  // target
o/p = 4      
*/


import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the no. of element in array....");
		int n = sc.nextInt();
		int[] a = new int[n];
        boolean b= false;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==target) {
				System.out.println(i);
                b=true;
				break;
			}    
        }
        if(b==false){
            System.out.println("-1");
        }
		
	}

}
