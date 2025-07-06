public class FindSortestPath {



//                 North
//               y ^
//                 |
//                 |
//                 |
//  West           |            x
//    <------------|------------>
//    -x           |(0,0)      East
//                 |
//                 |
//                 |
//              -y V 

                // south


// What are we doing in this function?
// ------------------------------------
// Imagine we start at coordinates (0, 0) on a 2D grid.
//
// The input is a series of directions (like "N", "S", "E", "W").
//
// For each direction:
// - If we move North  -> y++ (move up)
// - If we move South  -> y-- (move down)
// - If we move East   -> x++ (move right)
// - If we move West   -> x-- (move left)
//
// We keep updating our (x, y) position with each move.
//
// After all moves are complete, we calculate the (displacement)
// — the straight-line distance from the starting point (0,0)
//   to the final point (x, y).
//
// Displacement is calculated using the formula:
//     √((x2 - x1)^2 + (y2 - y1)^2)
//
// Since we always start from (0, 0), the formula becomes:
//     √(x^2 + y^2)


    public static int ShortestPath(String direction){

        int x = 0;
        int y = 0;

        for(int i = 0 ; i < direction.length(); i++){
            switch(direction.charAt(i)){
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                System.out.println("you give us the wrong direction");
                    return -1;
            }
        }

        return (int)Math.sqrt((x*x)+(y*y));

         
    }

    public static void main(String[] args) {
    
        String direction = "WNEENESENNN";
        

        System.out.println("the shortest distance it may cover " + ShortestPath(direction));



    }


}