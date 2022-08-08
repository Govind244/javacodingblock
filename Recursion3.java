            // ADVANCED Recursion
            
//Q1. Print all the permutations of a string.
/*public class Recursion3{
    public static void printPrem(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPrem(newStr, permutation+currChar);

        }
    } 
    public static void main(String args[]){
        String str = "abc";
        printPrem(str, "");
    }
}*/



//Q2. CountPathMaze 

/*public class Recursion3{
    public static int countPaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwards
        int downPaths = countPaths(i+1, j, n, m);

        //move rightside
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }
    public static void main(String args[]){
        int n=3, m=3;
        int totalPaths = countPaths(0,0,n,m);
        System.out.println(totalPaths);
    }
}*/



//Q3. Tiling problem

/*public class Recursion3{
    public static int placeTiles(int n, int m){
        
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        //vertically
        int vertPlacement = placeTiles(n-m, m);
        // horizontally
        int horPlacement = placeTiles(n-1, m);

        return vertPlacement + horPlacement;

    }
    public static void main(String args[]){
        int n=4, m=2;
        System.out.println(placeTiles(n,m));
    }
}*/


//Q4. Friends pairing problem

/*public class Recursion3{
    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }
        // single
        int Way1 = callGuests(n-1);
        //pair
        int Way2 = (n-1) * callGuests(n-2);

        return Way1 + Way2; 
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println(callGuests(n));
    }
}*/

// Q5 Print all the subsets of a set of first n natural no.

/*import java.util.*;
    public class Recursion3{
        public static void printSubsets(ArrayList<Integer>subset){
            for(int i=0; i<subset.size(); i++){
                System.out.print(subset.get(i)+ " ");
            }
            System.out.println();
        }
        public static void findSubsets(int n, ArrayList<Integer>subset){
            if(n==0){
                printSubsets(subset);
                return ;
            }
            //add hoga
            subset.add(n);
            findSubsets(n-1, subset);
            // add nahi hoga
            subset.remove(subset.size()-1);
            findSubsets(n-1, subset);
        }
        public static void main(String args[]){
            int n =3;
            ArrayList<Integer>subset = new ArrayList<>();
            findSubsets(n, subset);
        }
    }*/
