public class sumOfnNaturalNo {
// sum of first n natural numbers 
    public static void main(String[] args) {
        
        int n = 10;
        int sum = 0;
        int num = 1;

        while(num <= n){
            sum += num;
            num++;
        }

        System.out.println("the sum of first n natural numbers is : " + sum);

    }
}