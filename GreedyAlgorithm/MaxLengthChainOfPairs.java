package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
public class MaxLengthChainOfPairs {

    public static void main(String args[]){

        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs , Comparator.comparingInt(a -> a[1]));
        

        int chainlength = 1;
        int chainEnd = pairs[0][1];
       
        for(int i = 1 ; i < pairs.length ; i++){
            if(pairs[i][0] > chainEnd){
                chainlength++;
                chainEnd = pairs[i][1];

            }
        }


    System.out.println("max length of chain = " + chainlength);

    }

    
    
}