package pattern;

public class InvertedHalfPyramidWithNumber {

    public static void InvertedNumberedHalfPyramid(int height){

        for(int i = 1 ; i <= height ; i++)
        {
            for(int j = 1  ; j <=height-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int height = 5;

        InvertedNumberedHalfPyramid(height);

    }
    

}
