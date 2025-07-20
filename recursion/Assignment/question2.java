// Question 2 you are given a number (ex -2019), convert it into a String of english like "two zero one nine ". Use a recursive function to solve problem.
// NOTE - The digits of number will only be in the range 0-9 and the last digit of a number can't be 0

// Sample input : 1947
// sample Output : "one nine four seven"

package recursion.Assignment;

public class question2 {

    public static void printNumberNames(int number ){
        if(number <= 0){
            return ;
        }

        int num = number%10; 

        printNumberNames(number/10);

        switch( num ){
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
        }

    }


    public static void main(String[] args) {
        
        int number = 1947;

        printNumberNames(number);

    }
    

}