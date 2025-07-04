// What is Sorting?
// Sorting means arranging data in a particular order.
// This order can be either:
//  - Ascending (from smallest to largest)
//  - Descending (from largest to smallest)
//
// Sorting is used in many real-life situations.
// For example:
// - When we purchase a phone online, we often sort the list from "low to high" price.
// - While booking movie tickets, we compare different halls based on price — from cheapest to most expensive.
// - When shopping for clothes, shopkeepers often show us items sorted by price — starting from low-budget to high-budget.
//
// We see sorting everywhere in daily life to make comparisons easier and faster.

// Basic sorting Algorithms are 
// 1. Bubble
// 2. Selection
// 3. Insertion
// 4. CountSort  (Advance)
// 

//  How Bubble Sort Works
//
// Imagine you went to the gym and saw multiple weightlifting bars lying around.
// Your task is to arrange them in ascending order based on their weight.
//
// So here's what you do:
// - Pick the first two bars.
// - Compare them. If the first one is heavier than the second, swap them.
// - Now move to the second and third bar. Compare and swap if needed.
// - Keep doing this until you reach the end.
//
// What happens?
// -> The heaviest bar will "bubble up" to the last position — just like how bubbles rise to the top.
//
// Now repeat the same process, but only up to the second last bar.
// -> This time, the second heaviest bar will reach its correct position.
//
// Keep repeating this process for all remaining elements.
// Eventually, all the weights will be sorted in ascending order.
//
// This is how Bubble Sort works — slowly pushing the largest elements to the end in each round.


// Time COmplexity O(n^2)
// Here is the coding part
//         for(int i = 0 ; i < dumbel.length ; i++){

//             boolean sorted = true;
//             for(int j = 0 ; j< dumbel.length -i-1 ; j++){
             
//                 if(dumbel[j] > dumbel[j+1]){
//                     int temp = dumbel[j];
//                     dumbel[j] = dumbe[j+1];
//                     dumbel[j+1] = temp;
//                     sorted = false;
//                 }

//             }
//             if(sorted)break;
            
//         }

// ------------------------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXXXXX--------------------------------


// How Selection Sort Works
//
// Imagine you are a class teacher in a school.
// You need to arrange your students in a line based on their height — from shortest to tallest.
//
// Here's how you do it:
// 1. Look at all the students and find the one with the (smallest height).
// 2. Move that student to the **first position** in the line.
// 3. Now, ignore the first position and repeat the process:
//    - Find the next smallest student from the remaining group.
//    - Place them in the (second position).
// 4. Continue this process until all students are arranged (up to the second last one).
//
// This is exactly how **Selection Sort** works:
// - It selects the minimum element from the unsorted part and places it in the correct position.
// - One element is sorted in each round.

// Time COmplexity O(n^2)
// Here is the code
//  for(int i = 0 ; i < Student.length-1; i++){

//        int min = i;
//        for(int j = i+1 ; j< Student.length ; j++){
//            if(Student[j] < Student[min] ){
//               min = j;
//           }
//       }

//       if(min!=i){
//          int temp = Student[i];
//          Student[i] = Student[min];
//           Student[min] = temp;
//       }

 //  }

        
// -----------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx----------------------------

// How Insertion Sort Works
//
// Have you ever been to a petrol pump to fill fuel in your vehicle?
// If you’ve noticed, the worker who collects money usually keeps the notes organized in one hand.
//
// For example:
// - He may already have: 5 notes of ₹500, 4 notes of ₹100, and 3 notes of ₹20 — all arranged in order.
//
// Now, if you give him a ₹100 note, what does he do?
// - He temporarily takes out the ₹500 notes from the top,
// - Inserts your ₹100 note in the correct position among the other ₹100 notes,
// - Then puts the ₹500 notes back on top.
//
//  This is exactly how Insertion Sort works:
// - It assumes the left part of the list is already sorted.
// - For each new item, it finds the correct place in the sorted part and inserts it there.
// - It keeps shifting the larger elements to the right to make space.
//
//  This process is repeated for every element in the list.

// Time COmplexity O(n^2)
// COde :- part
// 
// pubic static void insertionSort(int arr[]){
//      for(int i = 1 ; i < arr.length; i++){
//          int curr = arr[i];
//          int prev = i-1;
//          while( prev >= 0 && arr[prev] > curr){
//              arr[prev+1] = arr[prev];
//              prev--;
//          }
//          arr[prev+1] = curr;
//      }
// }
// 
// 
// --------------------------------XXXXXXXXXXXXXXXXXXXXXXXXXXxx------------------------------
// Java Inbuilt Sort Function (Arrays.sort)
//
// Step 1: Import the Arrays utility class
// import java.util.Arrays;
//
//  Step 2: Use Arrays.sort(arrayName); 
// - This will sort the entire array in ascending order by default.
//
//  Time Complexity:
// - Uses Dual-Pivot QuickSort for primitives -> Average: O(n log n)
//
//  You can also sort part of the array:
// Arrays.sort(arrayName, fromIndex, toIndex); 
// - Sorts from fromIndex (inclusive) to toIndex (exclusive)
//
// Example:
// int[] arr = {5, 3, 1, 4, 2};
// Arrays.sort(arr, 1, 4);  // Only sorts elements at index 1 to 3
// Result -> [5, 1, 3, 4,]()

// 
// -----------------------------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX----------------------
// Count Sort
// Analogy :- //  Count Sort Analogy — The Gym Dumbbell Story
//
// Imagine you're in a gym, and someone asks you to arrange all the dumbbells in order of weight.
//
// But instead of picking and comparing each dumbbell one by one (like in Bubble Sort or Selection Sort),
// you take a smarter approach:
//
//  Step 1: Take a pen and paper.
// - Walk through the gym and make a note of how many dumbbells there are of each weight.
// - For example:
//     -> 5kg dumbbells: 4 pieces
//     -> 7.5kg dumbbells: 2 pieces
//     -> 10kg dumbbells: 3 pieces
//
//  Step 2: Now start arranging.
// - Look at your list: "4 dumbbells of 5kg"
// - Place all 4 of them first, one after another.
// - Then cross 5kg off your list.
//
// - Next: "2 dumbbells of 7.5kg"
// - Place them next in line.
// - Then cross 7.5kg off your list.
//
// Keep doing this until all weights are placed.
//
//  This is exactly how (Counting Sort) works:
// - First, count how many times each value occurs.
// - Then, rebuild the array based on the count — placing values in order, based on their frequency.
//
// It’s fast and efficient — especially when you know the range of possible values in advance.


// code of count sort


//   int max = arr[0];

// for(int i = 1 ; i < arr.length ; i++){
//     if(max < arr[i]){
//         max = arr[i];
//     }
// }

 // int Count[] = new int[max+1];
// for(int i = 0 ; i < arr.length ; i++){
//         Count[arr[i]]++;
// }

// int j = 0;
// for(int i = 0 ; i < Count.length ; i++){
            
//     while(Count[i] > 0){

//         arr[j] = i;
//         Count[i]--;
//         j++;
//     }

// }