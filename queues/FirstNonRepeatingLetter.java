package queues;

import java.util.Queue;
import java.util.LinkedList;
public class FirstNonRepeatingLetter {

    // here we want to find first non repeating letter
    public static char findFirstNonRepeatingLetterInString(String s ){

        // for this we made a queue in which we store our first non repeating letter at front 
        Queue<Character> q = new LinkedList<>();

        // here we make a frequency to check that the alphabet it non repeating or not 
        int frequencyArray[] = new int[26];
        
        // the variable in which we store first non repeating letter 
        char firstNonRepearingChar = '!';

        // we check all the letters in string 
        for(int i = 0 ; i < s.length(); i++)
        {
            // we increment the frequency of current char
            ++frequencyArray[s.charAt(i) - 'a'];

            // the we add current char in the queue 
            q.add(s.charAt(i));

            // until we found the non repeating letter in the front of queue we remove element 
            while( !q.isEmpty() && frequencyArray[q.peek() -'a'] > 1 ){
                q.remove();
            }
            
            // if there is no non repeating letter in q means q is empty so we store "!" in the non repeating char
            // if not we store the the char at queue front in it
            if(q.isEmpty()){
                firstNonRepearingChar = '!';
            }
            else{
                firstNonRepearingChar = q.peek();
            }

        }

        // then we return the character we get
        return firstNonRepearingChar;

    }


    public static void main(String[] args) {
       
            System.out.println(findFirstNonRepeatingLetterInString("aabbc")); // c
            System.out.println(findFirstNonRepeatingLetterInString("aabcbd")); // c
            System.out.println(findFirstNonRepeatingLetterInString("aabb"));   // !

    }

   

}