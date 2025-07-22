public class KeyInSortedRotatedArray {

    public static int findKey(int array[] , int key){

        int l = 0 ; 
        int r = array.length-1;

        while(l<=r){

            int mid = (l+r)/2;

            if(array[mid] == key){
                return mid;
            }

            if(array[l] <= array[mid]){

                if(key >= array[l] && key < array[mid]){
                    r = mid-1;
                }
                else{
                    l  = mid+1;
                }

            }
            else{

                if(key > array[mid] && key <= array[r]){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }

            }

        }

        return -1;
    }

    public static int findKey_rec(int array[] , int key , int l , int r){

        if(l > r){
            return -1;
        }

        int mid = (l+r)/2;

        if(array[mid] == key){
            return mid;
        }
        

        if(array[l] <= array[mid]){
            if(array[l] <= key && key < array[mid]){
                return  findKey_rec(array, key, l , mid-1);
            }
            else{
                return findKey_rec(array, key, mid+1, r);
            }
        }
        else{

            if(array[mid] < key && key <= array[r]){
                return findKey_rec(array, key, mid+1 , r);
            }
            else{
                return  findKey_rec(array, key, l , mid - 1 );
            } 

        }
    }

    public static void main(String[] args) {
        
        int array[] = { 4,5,6,0,1,2};

        int key = 1;

        int l = 0;
        int r = array.length -1;

        System.out.println("here the arguments are \n1. array[] \n2. key :- " +key + "\n3. l :- 0 \n4. r :- " + r  );

        System.out.println();

        System.out.println("the key index we get through find key function is "+ findKey(array, key));

        System.out.println();

        System.out.println("the index we get through find key recursive function is " + findKey_rec(array, key, l, r));

    }

}