public class SubElements {

    // HOw to make sub arrays
    // array = [1]  [2]  [3]  [4]  
    //                            
    //         IJ                 i=0 , j =i , k = i to j
    //          K                  print array[0] = (1)
    //                             
    //          I    J              i=0, j=1 , k = i to j
    //          K -> K              print array[0],array[1] = (1,2)
    //               
    //          I         J         i=0 , j=2 , k = i to j
    //          K -> K -> K         print array[0],array[1],array[2] = (1,2,3)
    //      
    //          I              J    i=0 , j=3 , k = i to j 
    //          K -> K -> K -> K    print array[0],array[1],array[2],array[3] = (1,2,3,4) 
    // 
    //              IJ              i=1 , j=i , k = i to j
    //               K              print array[1] = (2)
    // 
    //              I    J          i=1 , j=2 , k = i to j
    //                              print array[1],array[2]  = (2,3)
    // 
    // like that the loops goes until I == array.length-1


    public static void subElement(int array[]){

        for(int i =0 ; i < array.length; i++){
            for(int j = i ; j< array.length ; j++){
              System.out.print("(");
                for(int k = i; k <= j; k++){
                   System.out.print(array[k] + ",");
                }
                System.out.println(")");
            }
        }

    }
    public static void main(String[] args) {
        int array[] = {10,11,12,13,14,15,16};
        subElement(array);

    }

}