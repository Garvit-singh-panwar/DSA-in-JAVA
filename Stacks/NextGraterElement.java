// find the next gratest element
// the next gratest element of some element x in an array is the first greater element that is to the right of x in the same array.

// arr = [6,8,0,1,3]

// next Gteater = [8,-1,1,3,-1]


package Stacks;

import java.util.Stack;
public class NextGraterElement {

    // Function to find the Next Greater Element (NGE) for each element in the array
    // Parameters:
    // 1. element[]   -> The input array of elements
    // 2. nextGreater[] -> Array to store the next greater element for each position
    public static void findNextGreaterEle(int element[], int nextGreater[]) {

        // Stack to store indices of elements (used to find next greater elements)
        Stack<Integer> s = new Stack<>();

        // The last element has no elements to its right, so its NGE is -1
        s.push(element.length - 1);
        nextGreater[element.length - 1] = -1;

        // Traverse the array from the second-last element to the first
        for (int i = element.length - 2; i >= 0; i--) {

            int curr = element[i]; // Current element

            // Pop all elements smaller than or equal to the current element
            while (!s.isEmpty() && curr >= element[s.peek()]) {
                s.pop();
            }

            // If stack is not empty, top of stack is the next greater element
            if (!s.isEmpty()) {
                nextGreater[i] = element[s.peek()];
            }
            // If stack is empty, no greater element exists on the right
            else {
                nextGreater[i] = -1;
            }

            // Push the current index onto the stack
            s.push(i);
        }
    }


    public static void main(String[] args){
        int element[] = {6,8,0,1,3};
        int nextGreatest[] = new int[element.length];

        findNextGreaterEle(element, nextGreatest);
        for(int i : nextGreatest){
            System.out.print(i + " ");
        }System.out.println();

    }

}