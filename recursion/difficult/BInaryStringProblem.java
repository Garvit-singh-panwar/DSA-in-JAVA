// Print all binary String of size N without consecutive ones . 

package recursion.difficult;


public class BInaryStringProblem {

    public static int totalCombinations(int lengthOfString) {

        // If the length is 0, there's no way to form a valid binary string
        if (lengthOfString <= 0) {
            return 0;
        }

        // If length is 1, we can use either '0' or '1'
        if (lengthOfString == 1) {
            return 2; // "0", "1"
        }

        // If length is 2, valid combinations are: "00", "01", "10"
        // We cannot have "11"
        if (lengthOfString == 2) {
            return 3;
        }

        // For longer strings:
        // Case 1: If we place '0' at the current position, 
        //         the rest of the string of length (n-1) can be any valid combination
        // Case 2: If we place '1' at current position,
        //         the next position must be '0', so skip 1 place and solve for (n-2)
        return totalCombinations(lengthOfString - 1) + totalCombinations(lengthOfString - 2);
    }


// This function prints all valid binary combinations of a given length
// where no two 1s appear next to each other.

// Parameters:
// length - how many more digits we need to place
// lastdigit - true if the last placed digit was 1, false if it was 0
// str - the current combination of digits being built

public static void allCombination(int length, boolean lastdigit, String str) {

    // If we have placed all required digits, print the current combination
    if(length == 0){
        System.out.println(str);
        return;
    }

    // Always allowed: place 0 at the current position
    // Set lastdigit to false since we placed 0
    allCombination(length - 1, false, str + "0");

    // Only allowed to place 1 if the previous digit was not 1
    if(!lastdigit){
        // Place 1 and mark lastdigit as true
        allCombination(length - 1, true, str + "1");
    }
}



    public static void main(String[] args) {
        
        int length = 3;
        System.out.println("The total no of combinations which is possible when length = " + length + " are " + totalCombinations(length));
        System.out.println("All possible combinations are " );
        allCombination(length, false, "");

    }

}