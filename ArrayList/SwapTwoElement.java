import java.util.Scanner;
import java.util.ArrayList;

public class SwapTwoElement {
    
   
    public static void swap(ArrayList <Integer> list , int i, int j){

        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j , temp);

    }


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>();
        System.out.println("Enter elements of array");

        for(int i = 0 ; i < 5 ; i++ ){
            list.add(sc.nextInt());
        }

        int i = 1 ,  j = 3;

        System.out.println("Array list before swaping values at  indx " + i + ","+ j  + " "+ list);

        swap(list, i, j);

        System.out.println("array list after swaping values at indx " + i + ","+ j  + " "+ list );



    }
   
}
