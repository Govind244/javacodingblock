//Q1. Tower of Hanoi - Transfer n disks from source to destination over 3 towers.

/*public class Recursion2{
    public static void towerOfHanoi(int n, String src, String helper, String dest){
    if(n == 1){
    System.out.println("transfer disk " + n +" from " + src + " to " + dest);
    return;
    }
    towerOfHanoi(n-1, src, dest, helper);
    System.out.println("transfer disk " + n +" from " + src + " to " + dest);
    towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
    int n=4;
    towerOfHanoi(n, "S", "H", "D");
    }
}*/

// code from video notes
/*public class Recursion2 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
    if(n == 1) {
    System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    return;
    }
    //transfer top n-1 from src to helper using dest as 'helper'
    towerOfHanoi(n-1, src, dest, helper);
    //transfer nth from src to dest
    System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //transfer n-1 from helper to dest using src as 'helper'
    towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
    int n = 2;
    towerOfHanoi(n, "A", "B", "C");
    }
    }*/

//Q2. Print a string in reverse. "abcd"

/*public class Recursion2{
    public static void printRev(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String args[]){
        String str = "abcd";
        printRev(str, str.length()-1);
    }
}*/

//Q3. Find the occurrence of the first and last occurrence of an element using recursion. "abaacdaefaah"

/*public class Recursion2{
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar==element){
            if(first == -1){
                first = idx;
            }
         else{
                last = idx;
            }
        }    
            findOccurance(str, idx+1, element);
    }
        public static void main(String args[]){
            String str = "abaacdaefaah";
            findOccurance(str, 0, 'a');
        }
}*/


//Q4. Check if an array is sorted (strictly increasing). - O(n)

/*public class Recursion2{
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4};
        System.out.println(isSorted(arr, 0));
    }
}*/


//Q5. Move all ‘x’ to the end of the string. 

/*public class Recursion2{
    public static void moveAllX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count ++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString += currChar;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String args[]){
        String str = "axbcxxd";
        moveAllX(str, 0, 0, " ");
    }
}*/


//Q6. Remove duplicates in a string.

/*public class Recursion2{
    public static boolean[] map = new boolean [26];  
    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map [currChar -'a']){
            removeDuplicates(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar -'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String args[]){
        String str = "abbccda";
        removeDuplicates(str,0," ");
    }
}*/


//Q7. Print all the subsequences of a string.

/*public class Recursion2{
    public static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subsequences(str, idx+1, newString+currChar);
        subsequences(str, idx+1, newString);
    }
    public static void main(String args[]){
        String str = "abc";
        subsequences(str, 0, "");
    }
}*/


//Q8. Print all unique subsequences of a string.

/*import java.util.HashSet;
    public class Recursion2{
        public static void subsequences(String str, int idx, String newString, HashSet<String>set){
            if(idx == str.length()){
                if(set.contains(newString)){
                    return;
                }else{
                    System.out.println(newString);
                    set.add(newString);
                    return;
                }
            }
            char currChar = str.charAt(idx);
            subsequences(str, idx+1, newString+currChar, set);
            subsequences(str, idx+1, newString, set);
        }
        public static void main(String args[]){
            String str = "aaa";
            HashSet<String>set = new HashSet<>();
            subsequences(str, 0, "",set);
        }
    }*/


/*  Q9. Print keypad combination
( 0 -> .;
1 -> abc
2 -> def
3 -> ghi
4 -> jkl
5 -> mno
6 -> pqrs
7 -> tu
8 -> vwx
9 -> yz
)  */

public class Recursion2{
    public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar -'0'];
        for(int i=0; i<mapping.length(); i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "23";
        printComb(str, 0, "");
    }
}