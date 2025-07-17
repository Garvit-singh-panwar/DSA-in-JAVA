package recursion;

public class LastOccurenceOfElementInArray {

        public static int lastOccurenceOfElement(int array[] , int element , int i ){

            if(i < 0){
                return -1;
            }
            if(array[i] == element){
                return i;
            }

            return lastOccurenceOfElement(array, element, i-1);

        }

        public static int lastOccurenceOfElement2(int array[] , int element , int i ){

            if(i == array.length){
                return -1;
            }

            int isFound = lastOccurenceOfElement2(array, element, i+1);

            if(isFound == -1 && array[i] == element){
                return i;
            }
            
            return isFound;

            
        }


        public static void main(String[] args){


            int array[] = {1,2,3,4,5,5,6,7,5,8,3};
            int element = 5;

            int lastOccurence = lastOccurenceOfElement2(array, element, 0);

            System.out.println("the last occurence of " + element + " in array is at indx " + lastOccurence);

        }


}