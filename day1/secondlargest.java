package weekfour.day1;

import java.util.ArrayList;
import java.util.Collections;

public class secondlargest {
    public static void main(String[] args) {

        // Declare the array
        int[] arr = {3, 2, 11, 4, 6, 7};

        // Convert array to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Arrange the collection in ascending order
        Collections.sort(list);

        // Pick the 2nd element from the last
        int secondLargest = list.get(list.size() - 2);

        // Print the second largest number
        System.out.println("Second largest number is: " + secondLargest);
    }
}
