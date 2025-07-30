// For given n lines on X-axis, use 2 lines to form a container such 
// that it holds maximum water

import java.util.ArrayList;

public class ContinerWithMostWater {

    public static int containerWithMostWater(ArrayList <Integer> containerHeight ){
        
        int lH = 0;                                   //left most element for height

        int rH =  containerHeight.size()-1;          // right most element for height 
        int distance = rH-lH;                        // distance between left tower and right side tower
        int mostWaterContainer = Math.min(containerHeight.get(lH),containerHeight.get(rH)) * distance; // store the first biggerst distance container water 
        while(lH < rH){                                                          // we can not go in reverse and revisit the visited height 

            while(containerHeight.get(lH) <= containerHeight.get(rH) && lH < rH){ // while left side container height is smaller
                distance=rH-lH;                                                   // find the distance between left and right tower
                int currentWater = containerHeight.get(lH) *distance;            // find he water present between two container
                if(mostWaterContainer < currentWater){                      // if it is more then the mostWater container we make the current water the most water we stored inside a container
                    mostWaterContainer = currentWater;
                }
               
                lH++;                                                   //increase to check next height of the tower
            }

            while(containerHeight.get(rH) <= containerHeight.get(lH) && lH < rH){   // when right side container height is smaller 
                distance = rH-lH;                                                  // calculate the distance between them
                int currentWater = containerHeight.get(rH) *distance;              // calculate current collected water
                if(mostWaterContainer < currentWater){     // if its more than the mostWater recoarded we store current water as the mostwater
                    mostWaterContainer = currentWater;
                }

                rH--;                                     // decrease to check the nezt height of the tower
            }

            
        }

        return mostWaterContainer;

    }

    // we can also make this function directly like this 
    public static int containerWithMostWater2(ArrayList<Integer> containerHeight) {
    int lH = 0;
    int rH = containerHeight.size() - 1;
    int mostWaterContainer = 0;

    while (lH < rH) {
        int height = Math.min(containerHeight.get(lH), containerHeight.get(rH));
        int width = rH - lH;
        int currentWater = height * width;

        if (currentWater > mostWaterContainer) {
            mostWaterContainer = currentWater;
        }

        // Always move the pointer with the smaller height
        if (containerHeight.get(lH) < containerHeight.get(rH)) {
            lH++;
        } else {
            rH--;
        }
    }

    return mostWaterContainer;
}

    public static void main(String[] args){
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int mostWater = containerWithMostWater(height);

        System.out.println("the most water inside a container is " + mostWater);


    }
    
}