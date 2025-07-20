// Given n friends , each one can remain single or can be paired up with some other friend . each friend can be pared only once . Find out the total number of ways in which friends can remain single or can be paired up 

package recursion.difficult;

public class FriendPairingProblem {



    public static int friendsPairing(int n){
        // If there are no friends, no one can pair or stay single
        if(n <= 0){
            return 0;
        }

        // If there is only one friend, only one way: stay single
        if(n == 1){
            return 1;
        }

        // If there are two friends, they can either:
        // 1. Stay single (both individually)
        // 2. Form one pair
        // So total 2 ways
        if(n == 2){
            return 2;
        }

        // Case 1: One friend stays single -> solve for (n - 1) friends
        int single = friendsPairing(n - 1);

        // Case 2: One friend pairs with any of (n - 1) others -> (n - 1) * ways to pair remaining (n - 2) friends
        int pair = (n - 1) * friendsPairing(n - 2);

        // Total ways = single + pair
        return single + pair;
    }

    public static void main(String[] args) {
        
        int friends = 12;

        System.out.println("Total ways to pair " + friends + " friends: " + friendsPairing(friends));



    }

}