package recursion.difficult;
// Remove duplicates in String 
// the character goes from 'a' to 'z' only


public class RemoveDuplicatesInString {

    // here is the code 
    public static String removeDuplicates(String str ,int i , boolean array[] , StringBuilder newStr){
        // if string is end then we have to return
        if(i == str.length()){
            return newStr.toString();
        }

        // indx is the index of boolean array in which we check whether the alphabet is already present or not
        int indx = str.charAt(i) -'a';

        // If the alphabet does not exist then we mark it as true which means it exists now and add it to the new string as it appears for the first time

        if(array[indx] == false){
            array[indx] = true;
           newStr.append(str.charAt(i));
        }

        // then we go for the remaining strings
        return removeDuplicates(str, i+1, array, newStr);
    }

    public static void main(String[] args) {
       
        String str = "appnnacollege";
        boolean array[] = new boolean[26];

        StringBuilder newStr = new StringBuilder();
        System.out.println("the string "+ str +" withot duplicate alphabet looks like "+ removeDuplicates(str, 0,array , newStr));
        
    }

}