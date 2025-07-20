// We are giving a String S we need to find the count of all contigious substrings starting and ending with the same character.

// Sample Input 1 : S = "abcab"
// Sample Output 1 : 7

// There are 15 substring of "abcab" : "a" , "ab" , "abc" , "abca" , "abcab" 
// , "b" , "bc" , "bca" , "bcab" , "c" , "ca" , "cab" , "a" , "ab" , "b"
// Out of the above SubStrings , there are 7 subStrings : a , abca , b , bcab , c , a ,and b.
// So only 7 contigious substring start and end with the same character 

// Sample Input 2 : S = "aba"
// Sample Output 2 : 4
// the substring are 'a', 'b' , 'a' and 'aba' 

package recursion.Assignment;

public class question4 {

    public static int substringWithSamecharAtStartOrEnd(String str , int i, int j){

        if(i >= str.length()){
            return 0;
        }

        if(j >= str.length()){
            return substringWithSamecharAtStartOrEnd(str, i+1, i+1);
        }
        

        int count = 0;
        if(str.charAt(i)==(str.charAt(j))){
            count = 1; 
        }

        return count+ substringWithSamecharAtStartOrEnd(str, i, j+1);
        
    }
     
    public static void main(String[] args) {
        
        String Str = "aba";

        System.out.println("from all the above SubStrings of '" + Str + "' there are only " + substringWithSamecharAtStartOrEnd(Str, 0, 0) + " subStrings start and end with the same character" ) ;

    }

    
}