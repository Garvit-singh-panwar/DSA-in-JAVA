// array list is a inbuilt datastructure in javascript
// it is a linear type of datastructure

//          Array            |           Arraylist            |
// --------------------------|--------------------------------|
//1. fixed size              | dynamic size                   |
//                           |                                |
//2. premitive data type can |  premitive datatypes can't be  |
// be stored                 |  stored                        |
// ------------------------------------------------------------

// to use array list we have to import the ArrayList class
// Array list is a part of java collection framework 
// same as vectors in cpp


import java.util.ArrayList;
import java.util.Collections;

public class notes {
    public static void main(String[] args) {

        // To declare an ArrayList we write this line
        // ArrayList<DatatypeClass> name = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        // We wrote Integer (capital I) inside <> because ArrayList doesn't store primitive types like int directly
        // That's why we use wrapper classes like Integer for int, Boolean for boolean, etc.

        // Operations on ArrayList

        // Adding values into ArrayList
        // We use .add(value) function to add elements at the end
        list.add(11); // O(1) time
        list.add(12);
        list.add(13);
        list.add(14);

        // Accessing elements in ArrayList
        // Just like in arrays we use array[i], here we use list.get(i)
        // It takes index as input and gives element at that index
        // It also takes O(1) time
        System.out.println("Accessing elements:");
        System.out.println(list.get(0)); // prints 11
        System.out.println(list.get(1)); // prints 12
        System.out.println(list.get(3)); // prints 14

        // System.out.println(list.get(4)); ❌ This will give error because index 4 doesn't exist now

        // Removing an element from ArrayList
        // In arrays we can't remove, we just replace with 0
        // But in ArrayList we can remove using .remove(index)
        // It shifts remaining elements, so it takes O(n) time
        list.remove(1); // removes value at index 1 (12)
        System.out.println("After removing index 1: " + list);

        // Setting a value at a specific index
        // We can replace an element using .set(index, value)
        // It also takes O(n) time sometimes
        list.set(1, 12); // replaces value at index 1 with 12
        System.out.println("After setting index 1 to 12: " + list.get(1));

        // Checking if a value exists in ArrayList
        // We use .contains(value)
        // It gives true or false and takes O(n) time
        System.out.println("Does list contain 12? " + list.contains(12));

        // Getting the size of the list
        // Just like array.length, here we use list.size()
        System.out.println("The length of list is: " + list.size());

        // Printing all elements one by one
        System.out.println("Printing list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Printing elements in reverse order
        System.out.println("\nPrinting list in reverse:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        // Sorting the ArrayList in ascending order
        // For that we use Collections.sort(list)
        Collections.sort(list);
        System.out.println("\nList after sorting in ascending order: " + list);

        // Sorting in descending order
        // For that we use a second argument: Collections.reverseOrder()
        // This second argument is called a comparator (a logic for sorting)
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("List after sorting in descending order: " + list);

        // Some behind-the-scenes info:
        // ArrayList works using a normal array internally
        // At start, it creates a fixed size array (example: 10 size)
        // When that gets full, it creates a new array with double size
        // It copies old values into new array and deletes old one
        // That's how it looks like ArrayList grows automatically

        // Now let's talk about 2D ArrayList (ArrayList inside ArrayList)

        // To make a 2D ArrayList we create:
        // ArrayList<ArrayList<Datatype>> name = new ArrayList<>();
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Making first inner list
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        mainList.add(list1); // add list1 to mainList

        // Making second inner list
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        mainList.add(list2); // add list2 to mainList

        //  Printing the 2D ArrayList
        // We use two loops for that
        // First loop gives us inner ArrayList one by one
        // Second loop prints elements from that inner list
        System.out.println("Printing 2D ArrayList:");
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> curr = mainList.get(i); // current inner list
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println(); // for new line after each row
        }

    }
}



