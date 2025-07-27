package BackTracking;

// Math trick to solve grid ways in linear time linear time 

// we use concept of permutation 
// so for a single way we can say we have (n-1) down turns  and  (m-1) Right turns 

// so lets say we have (n-1) D characters  and (m-1) R characters
// so we have to find total no of permutation possible using all those character together as a string 
//                                                            (starting point)
//                                                               |
//                                                               v
// for 5x4 matrix we have 5-1 forward moves and 4-1 down moves (0,0)-r-r-r-r 
//                                                                         d
//                                                                         d
//                                                                         d -> (5,4) we reached the ending position
//  
// like this combination we have to find all possible combinations
// so instead all permutation string (which takes a lot of time ) we directly find it using formula of permutation  
// 
// the total no of permutaions possible are the path form 0,0 to (n-1),(m-1)
//                               -------------------
// the formula of permutation is |  ( n-1 + m-1)!  |
//                               | _______________ |   
//                               | (n-1)! * (m-1)! |
//                               -------------------





public class GridWaysInLinearTime {

    public static int factorial(int n){

        int fact = 1; 
        for(int i = 2 ; i <= n ; i++){
            fact *= i;
        }

        return fact;

    }

    public static int GridWays(int n , int m ){
        
        int gridways = factorial(n-1+m-1) / (factorial(n-1)*factorial(m-1));

        return gridways;
    }
    
    public static void main(String[] args) {
        
        int n = 3;
        int m = 3;

        int noOfWays = GridWays(n, m);

        System.out.println("the number of ways from 0,0  to " + n +"," + m + " are " + noOfWays );

    }

}