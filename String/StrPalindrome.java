public class StrPalindrome {

    public static boolean isPalindrome(String str){
        int l = 0 ;
        int r = str.length()-1;


        while(l<r){

            if(str.charAt(l) != str.charAt(r)){
                return false;
            }

            l++;
            r--;
        }


        return true;
    }

    public static void printPalindromeOrNot(boolean palindrome , String str){

        if(palindrome){
            System.out.println(str + " is a palindrome ");
        }
        else{
            System.out.println(str + " is not a palindrome ");
        }


    }

    public static void main(String[] args) {
        
        String str = "civic";
        String str1 = "level";
        String str2 = "racecar";
        String str3 = "My Name ";
        printPalindromeOrNot(isPalindrome(str), str);
        printPalindromeOrNot(isPalindrome(str1), str1);
        printPalindromeOrNot(isPalindrome(str2), str2);
        printPalindromeOrNot(isPalindrome(str3), str3);


    }
    
}