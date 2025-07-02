public class trappingRainWater {
// we are solving this problem using two extra arrays
// first array is leftMax[] — here we store the tallest tower we have seen so far from the left side (left to right)
// second array is rightMax[] — here we store the tallest tower we have seen so far from the right side (right to left)

// we already know how water is collected between buildings or towers
// to collect water between two towers, we need:
   // - a left tower
   // - a right tower
   // - and a gap (valley) between them where water can stay

// water will only stay if both sides are taller than the middle block
// so we compare the height of leftMax and rightMax for every block
// the amount of water at each block = min(leftMax, rightMax) - height of current block

   public static int TotalCollectedWater(int blockHeight[]){
    int leftMax[] = new int[blockHeight.length];
    int rightMax[] = new int[blockHeight.length];

    int trappedWater = 0;

    int max = Integer.MIN_VALUE;
    for(int i = 0 ; i < blockHeight.length ; i++ ){
        if(blockHeight[i] > max){
            max = blockHeight[i];
        }
        leftMax[i] = max;
    }
    max = Integer.MIN_VALUE;
    for(int i =  blockHeight.length-1 ; i >= 0 ; i-- ){
        if(blockHeight[i] > max){
            max = blockHeight[i];
        }
        rightMax[i] = max;
    }


    for(int i = 0 ; i< blockHeight.length; i++){

      trappedWater += Math.min(leftMax[i], rightMax[i]) - blockHeight[i];
    }
    
    return trappedWater;
 }

    public static void main(String[] args) {
        
        int towerHeight[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println("water trapped inside the tower : " + TotalCollectedWater(towerHeight));
       

    }


}