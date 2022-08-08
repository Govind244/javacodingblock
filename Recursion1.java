// Q1. Print numbers from 5 to 1.

/*public class Recursion1{
    public static void printNumb(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String args[]){
        int n=5;
        printNumb(n);
    }
}*/


// Q2. Print numbers from 1 to 5.

/*public class Recursion1{
    public static void printNumb(int n){
        if(n==6){
            return; // return 0; will give you error
        }
        System.out.println(n);
        printNumb(n+1);
    }
    public static void main(String args[]){
        int n=1;
        printNumb(n);
    }
}*/

// Q3. Print the sum of first n natural numbers.

/*public class Recursion1{
    public static void printSum(int i, int n, int sum){
       if(i==n){
        sum += i;
        System.out.println(sum);
        return;
       }
       sum += i; // sum = sum + i;
       printSum(i+1, n , sum);
    }
    public static void main(String args[]){
        printSum(1, 5, 0);
    }
}*/

// Q4. Print factorial of a number n.

/*public class Recursion1{
    public static int calcFactorial(int n){
       if(n==1 || n==0){
        return 1;
       }
       int fact_nminus1 = calcFactorial(n-1);
       int fact_n = n * fact_nminus1;
       return fact_n;
    }
    public static void main(String args[]){
        int n = 5;
        int ans = calcFactorial(n);
        System.out.println(ans);
    }
}*/
//class notes code
/*class Recursion1 {
    public static void printFactorial(int n, int fact) {
    if(n == 0) {
    System.out.println(fact);
    return;
    }
    fact *= n;
    printFactorial(n-1, fact);
    }
    public static void main(String args[]) {
    printFactorial(5, 1);
    }
}*/

// Q5. Print the fibonacci sequence till nth term.

/*public class Recursion1{
    public static void printFib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n-2);
    }
}*/
// code from lecture video
/*class Recursion1 {
    public static void printFib(int a, int b, int n) {
    if(n == 0) {
    return;
    }
    System.out.println(a);
    printFib(b, a+b, n-1);
    }
    public static void main(String args[]) {
    printFib(0, 1, 5);
    }
    }*/
// Q6. Print x^n (with stack height = n)

/* public class Recursion1{
        public static int calcPower(int x, int n){
            if(n==0){ //base case 1
                return 1;
            }
            if(x==0){ // base case 2
                return 0;
            }
            int xpownm1 = calcPower(x, n-1); // kaam 
            int xpown = x * xpownm1;
            return xpown;
        }
        public static void main(String args[]){
            int x = 2, n = 5;
            int ans = calcPower(x, n);
            System.out.println(ans);
        }
    }*/
    // code from video notes
    /*class Recursion1 {
        public static int printPower(int x, int n) {
        if(n == 0) {
        return 1;
        }
        if(x == 0) {
        return 0;
        }
        int x_ = printPower(x, n-1);
        int xn = x * x_;
        return xn;
        }
        public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
        }
    }*/

    public class Recursion1{
        public static int calcPower(int x, int n){
            if(n==0){ //base case 1
                return 1;
            }
            if(x==0){ // base case 2
                return 0;
            }
            // if n is even
            if(n%2==0){
                return calcPower(x, n/2) * calcPower(x, n/2);
            }else{
                return calcPower(x, n/2) * calcPower(x, n/2) * x;
            }
        }
        public static void main(String args[]){
            int x = 2, n = 5;
            int ans = calcPower(x, n);
            System.out.println(ans);
        }
    }