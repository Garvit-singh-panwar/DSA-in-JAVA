package BackTracking;



public class FindPermutation {

    // What we are doing in this function 
    // we are accepting two arguments 
    // 1. Main String
    // 2. permutaion String
    
    // we have to find permutation in this 
    // so we have to find all possible combination we can make using all the characters in the main str 
    // to do that we have to place every character at every place or index 
    // to do that we apply a for loop 
    // using for loop we pass every character at every position of permutation string 
    // and remove that character from the main string 
    // when our main string become empty we stop and print permutation string 

    public static void permutation(String str , String ans ){
      
        // base case : when main string becomes empty print and return 
        if(str.length()==0){
            System.out.print(ans + " ");
            return;
        }

        // to pass every remaining character of main string in the for loop 
        for(int i = 0 ; i < str.length() ; i++ ){
            // current character is the character at ith indx 
            char curr = str.charAt(i);

            // new string is the new main string without current character 
            String newString = str.substring(0, i)+str.substring(i+1);

            // now we are calling function for new main string and new character at that position 
            permutation(newString, ans+curr);
        }

        
    }

 // Its time complexity is O(n × n!)
// Here's why:
// - At each level of recursion, the for-loop runs str.length() times (i.e., up to n, then n-1, ..., down to 1).
// - So, the total number of recursive calls is n! (all possible permutations).
// - But in each call, we also do some work like substring creation and string concatenation (ans + curr),
//   which takes O(n) time (since strings are immutable in Java).
// - Therefore, total time complexity becomes O(n × n!).
// Example: For n = 3 (abc), the function makes 6 calls (3!), and in each call, we do O(3) work.

    public static void main(String[] args) {
        
        String str = "abc";

        permutation(str, "");

    }
}