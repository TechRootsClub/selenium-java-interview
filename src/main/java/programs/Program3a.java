package programs;

import java.util.ArrayList;
import java.util.List;

public class Program3a {

    public static void main(String[] args) {
        int arr[] = {18, 0, 19, 1, 6, 0, 9, 0, 5, 0, 1};
        List<Integer> list = new ArrayList<>(); // using list of same size of the input array
        int countOfZeros = 0;  // to count the number of zeros in the input array
        for (int i = 0; i < arr.length; i++) { // iterate through the input array
            if (arr[i] != 0) { // if the element is non-zero then add it to the list
                list.add(arr[i]); // add the non-zero element to the list
                // note : as this is List so insertion order will be preserved.
            } else {
                countOfZeros++; // increment the count of zeros
            }
        }
        // Now countOfZeros has total number of 0's in the input array
        // 18,19,1,6,9,5,1
        while (countOfZeros > 0) { // iterating the loop until all the zeros are added to the list
            list.add(0); // add the zero to the list after all the non-zero elements
            countOfZeros--;  // decrement the count of zeros once added in the list
        }

        System.out.println("Output:" + list); // Output:[18, 19, 1, 6, 9, 5, 1, 0, 0, 0, 0]
    }
}
