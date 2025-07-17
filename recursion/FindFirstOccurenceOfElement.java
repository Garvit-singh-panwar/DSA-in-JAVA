package recursion;

public class FindFirstOccurenceOfElement {

    
    public static int firstOccurenceOfElement(int[] array, int element , int i  ){

        if(i == array.length){
            return -1;
        }

        if(array[i] == element){
            return i;
        }

        return firstOccurenceOfElement(array, element, i+1);

    }


    public static void main(String[] args) {
        
        int array[] = {51,7,25,43,21};
        int element = 7;

        int firstOccurence = firstOccurenceOfElement(array, element, 0);

        System.out.println("the first occurence of element " + element + " is at index " + firstOccurence);



    }



}