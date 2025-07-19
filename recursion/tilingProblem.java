// Given a "2xn " broad and tile in size "2x1" , count the number of ways to tile the given board the 2x1 tiles.
// (A tile can either placed horizontally or vertically)
package recursion;

// We are given a floor of size 2 x n (2 rows and n columns).
// We have an unlimited number of 2 x 1 tiles.

// We can place each tile in two ways:
// 1. Vertically – it takes 1 column (2 x 1 space).
// 2. Horizontally – it takes 2 columns side-by-side (1 x 2 space).

// The goal is to find the number of different ways to tile the entire floor.
// We are not counting how many tiles are used, but how many different arrangements are possible.

// Let's understand a few base cases:
// - When n == 0: There's 1 way – do nothing. (This is still a valid arrangement.)
// - When n == 1: Only 1 way – place one tile vertically.
// - When n == 2: Two ways – 
//      1. Place two vertical tiles.
//      2. Place two horizontal tiles side-by-side.

// So, for n >= 3, we break the problem into subproblems:
// - If we place one tile vertically, we reduce the problem to size n - 1.
// - If we place two tiles horizontally, we reduce the problem to size n - 2.

// This gives us the recurrence relation:
// ways(n) = ways(n - 1) + ways(n - 2)

// In short:
// → Place one tile vertically → solve for (n - 1).
// → Place two tiles horizontally → solve for (n - 2).
// Add both to get total ways for current n.

// This pattern is exactly like the Fibonacci series.


//   _________________
//  |  |              |
//  |  |              |  2   1st way
//  |  |              |      if we place vertically
//  |__|______________|         
//    1
//  ----------n--------


//        _________________
//     1 |      |          |
//       |______|          |  2   2st way
//     1 |      |          |      if we place vertically
//       |______|__________|         
//           2
//      ----------n--------





public class tilingProblem {

    public static int Tiling(int n){

        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 1;
        }

        return Tiling(n-1) + Tiling(n-2);
    }


    public static void main(String[] args) {
        
        int n = 10;
        
        System.out.println("total no of ways in which we can fit the tiles for n = " + n +" are : " + Tiling(n));

    }

}