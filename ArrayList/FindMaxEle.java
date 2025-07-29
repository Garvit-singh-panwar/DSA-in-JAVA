
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMaxEle {

    
    public static int maxEle(ArrayList <Integer> list ){

        Collections.sort(list);

        return list.get(list.size()-1);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>();

        System.out.println("Enter elements in an array");
        System.out.println("Enter 1101 to exit");

        int i = 0;
        i = sc.nextInt();
        do{

            list.add(i);
            i = sc.nextInt();


        }while(i != 1101);

        int max = maxEle(list);

        System.out.println("the maxElement in the array is " + max);



    }


}