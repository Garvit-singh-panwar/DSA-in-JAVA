// What is a linear Search 
// Linear Search is a simplest searching algorithm 
// It works by checking each element one by one until it meets the desired element


// Real-Life Analogy: "Pangat in Indian Weddings/Temples"

//  Imagine a traditional Indian pangat — people sit in a row on the floor to eat during a marriage or at a temple.

//  A server is asked to find a specific person (say, "Ravi") and give him a sweet (like a gulab jamun).

//  The server starts from the beginning of the row, asking each person:
// "Are you Ravi?"
//  If not, he moves to the next person...
//  This continues until he finds Ravi.

//  This is exactly how Linear Search works: 
//     You check each element one by one until you find a match.



// Java program to demonstrate Linear Search using the Pangat analogy

public class LinearSearch {

    
    public static void linearSearch(String pangat[] , String target){

        // we search for ravi one by one until the pangat is ended
        for(int i = 0 ; i < pangat.length ; i++){

            // if ravi found 
            if(pangat[i] == target){

                // we print where ravi found at position __ and then return 
                System.out.println(target + " found at index " + i);
                return;

            }

        }

        // if ravi not found we print ravi not found
        System.out.println(target + " not found ");

    }

    public static void main(String[] args) {
        
      
        // Array representing names of people sitting in a pangat
        String[] pangat = {"Rahul", "Sneha", "Anil", "Pooja", "Ravi" , "Meena"};

        // The name we want to search in the array
        String target = "Ravi";

         linearSearch(pangat, target);
        

    }


}
