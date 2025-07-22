// Apply merge sort to sort an array of string . 
// (Assume that all the characters in all the String are in lower case)

// Sample input :- arr = { "sun" , "earth" , "mars" , "mercury"};
// sample Output :- arr = { "earth" , "mars" , "mercury" , "sun" };

package Assignment;

public class Question1 {

    
    public static void mergeSort(String array[] , int l , int r){

        if(l >= r){
            return;
        }

        int mid = (l+r)/2;

        mergeSort(array, l, mid);
        mergeSort(array, mid+1, r);
        merge(array, l , mid , r);

    }

    public static void merge(String array[] , int l , int mid , int r){

        String temp[] = new String[r-l+1];
        int i = 0;
        int first = l;
        int second = mid+1;
        while(first <= mid && second <= r ){
            int smaller = returnSmallest(array[first], array[second]);

            if(smaller == 1){
                temp[i] = array[first];
                first++;
                i++;
            }
            else{
                temp[i] = array[second];
                second++;
                i++;
            }

        }

        while(first <= mid){
            temp[i] = array[first];
            first++;
            i++;
        }
         while(second <= r){
            temp[i] = array[second];
            second++;
            i++;
        }

        for(int j = 0  ; j < temp.length ; j++){
            array[l+j] = temp[j];
        } 

    }


    // in this function we are comparring two string 
    // we are taking two arguments string 1 and string 2
    // and then repeatedely comparing very character of both string whose character is smaller 
    // if the character of first string is smaller we return 1;
    // if the character of second string is smaller we return 2;
    // if any one exceed its size we check there length if the length of first string is smaller then we return 1 
    // if the length of second string is smaller we return 2

    public static int returnSmallest(String str1 , String str2 ){
        int i = 0; 
        while(i < str1.length() && i < str2.length()){
            if(str1.charAt(i) < str2.charAt(i)){
                return 1;
            }
            else if(str1.charAt(i) > str2.charAt(i)){
                return 2;
            }

            i++;

        }

        if(str1.length() <= str2.length()){
            return 1;
        }
        else{
            return 2;
        }

    }


    public static void main(String[] args){

        String[] arr = { "sun" , "earth" , "mars" , "mercury"};
        

        System.out.println("String array before sorting");
        for(String i : arr){
            System.out.print(i + " ");
        }

        System.out.println("\n");
        mergeSort(arr, 0, arr.length-1);

        System.out.println("String array after sorting");

        for(String i : arr){
            System.out.print(i + " ");
        }


    }


}