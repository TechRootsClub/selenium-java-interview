package programs;

//i/p: {18, 0, 19,1,6,0,9,0,5,0,1}
// o/p: {18 19 1 6 9 5 1 0 0 0 0}
// move all the non-zero elements to the left of the array
// and all the zero elements to the right of the array

public class Program3 {

    public static void main(String[] args) {
        int arr[] = {18, 0, 19, 1, 6, 0, 9, 0, 5, 0, 1};

        int outputArr[] = new int[arr.length]; // create an output array with the same length as the input array
        int start = 0; // start from the beginning of the output array
        int end = arr.length - 1; // to insert the zeros at the end of the output array
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {    // check if the element is zero then insert it at the end of the output array
                outputArr[end] = 0;
                end--;  // decrement the end pointer to insert the next zero at the end
            } else {
                outputArr[start] = arr[i]; // insert the non-zero element at the start of the output array
                start++; // increment the start pointer to insert the next non-zero element at the start
            }
        }
        System.out.println("Output:");
        for (int i = 0; i < outputArr.length - 1; i++) {
            System.out.print(outputArr[i] + " ");
        }
        //o/p: 18 19 1 6 9 5 0 0 0 0
    }
}
