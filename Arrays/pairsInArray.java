public class pairsInArray {


    // how to print pairs 
    //  0  1  2  3  4 
    // [1][2][3][4][5]      I = 0  J = I+1   I < array.length   , J < array.length    here array.length = 5
    //  |  |  |  |  | 
    //  I  J  J  J  J   print (I,J)  then  I++ -> I=1 , J = I+1 -> J=2
    //     |  |  |  |
    //     I  J  J  J   print (I,J)  then  I++ -> I=2 , J = I+1 -> J=3
    //        |  |  |
    //        I  J  J   print (I,J)  then  I++ -> I=3 , J = I+1 -> J=4
    //           |  |              
    //           I  J   print (I,J)  then  I++ -> I=4 , J = I+1 -> J=5   now J == array.length so the loop stoped 

    public static void pair(int array[]){
    
        for(int i = 0; i< array.length ; i++ ){

            for(int j = i+1 ; j < array.length ; j++){
                System.out.print(" (" +array[i] +","+ array[j] + ") ");
            }

            System.out.println();

        }

    }
    public static void main(String[] args) {
        
        int array[] = {1,2,3,4,5,6};

        pair(array);

    }
    
}