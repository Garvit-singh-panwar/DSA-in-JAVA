package Assignment;

// Given a non-negative integers representing an elevation map where the width of each bar is 1.
// compute how much water it can trap after raining.

// Example 1 : input : height = [0,1,0,2,1,0,1,3,2,1,2,1];

// output 6

// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
// in this case 6 units of rain water (blue section are being trapped)


// Example 2:  input: height = [4,2,0,3,2,5];
// Output : 9
// 

public class question4 {


    //  What this function does:
    // It calculates how much rainwater can be trapped between the blocks after it rains.

    //  How to imagine it:
    // Think of the array as buildings of different heights standing next to each other.
    // Between these buildings, rainwater can get trapped — just like how water collects between walls.

    // Example:
    //                    __
    //      __           |  |
    //     |  |  1 3 5 7 |  |    - Each block (unit) can hold 1 liter of water.
    //     |__|_2_4_6_8__|__|    - Here, the left wall is shorter than the right one,
    //                            so water can be stored only up to the height of the left wall.

    //  Key idea:
    // Water gets trapped only where there is a shorter block between two taller ones.
    // But if one side (left or right) is lower, water can overflow from that side.
    // So, we only count water up to the height of the smaller wall on either side.

    //  How we solve it:
    // - We use two pointers: one starting from the left (l), and one from the right (r).
    // - We keep track of the tallest wall we’ve seen so far from both sides:
    //   → lBiggest for the left, and rBiggest for the right.

    // At every step:
    // - We move the pointer from the side that has the smaller wall.
    // - If the current block is shorter than the tallest wall on that side,
    //   it means water can be trapped there.
    // - So we add (tallest wall - current block height) to our total trapped water.
    // - Otherwise, we update the tallest wall seen so far.

    // We continue doing this until the left and right pointers meet.
    // This way, we calculate the total amount of water that can be trapped.


    public static int trappedWater(int blocksHeight[]){

        int trappedWater = 0;
        int lBiggest = blocksHeight[0];
        int rBiggest = blocksHeight[blocksHeight.length-1];
        
        int l= 1;
        int r = blocksHeight.length-2;

        while(l <= r){
            
            if(lBiggest< rBiggest){

                if(lBiggest < blocksHeight[l] ){
                    lBiggest = blocksHeight[l];
                    
                }else{
                    trappedWater += lBiggest - blocksHeight[l];
                    
                }

                 l++;
            }
            else{
                if(rBiggest < blocksHeight[r] ){
                    rBiggest = blocksHeight[r];
                   
                }else{
                    trappedWater += rBiggest - blocksHeight[r];
                   
                }

                  r--;
            }

        }   

        return trappedWater;
    } 

    public static void main(String[] args) {
        
        int blockHeight[] = {3,0,1,0,4,0,2};
        System.out.println("The expected rainwater to be trapped is :"+trappedWater(blockHeight));

    }
    
}