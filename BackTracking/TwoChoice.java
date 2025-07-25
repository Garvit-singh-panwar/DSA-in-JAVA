package BackTracking;

  

public class TwoChoice {

// This function prints all the subsequences (substrings formed by skipping or including characters)
// of a given string using recursion. It takes three arguments:
// - str: the original input string
// - ans: the current subsequence being built
// - i: the current index in the original string

// The idea is based on recursive choices:
// At each character in the string, we have two options:
// 1. Include the character in the current 'ans' string.
// 2. Exclude the character and move to the next one.

// This process continues recursively for all characters until we reach the base case
// (i == str.length()), at which point we print the current 'ans'.


// The time complexity of this is o(n*2^n);
// why because we have n character and every character have 2 choices 
// 1 char have 2^1 choice two character have 2^2 co n character have 2^n choice 
// and we have to check this n times 
// thats why the time complexity is n*2^n 

    public static void subString(String str , String ans , int i){
        // Base case : if we have reached at the end of the string 
        if(i >= str.length()){
            System.out.println(ans + " ");
            return ;
        }

        subString(str, ans+str.charAt(i), i+1); // yes choice: include the character
        subString(str, ans, i+1); // no choice: exclude the character 

    }

    public static void main(String[] args){
        String str = "abc";
        String ans ="";

        subString(str, ans, 0);

    }
    
}

