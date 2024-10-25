public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {12, 4, 23, 67, 34, 90, 99, 2, 67, 454, 78, 56, 11, 6, 4};

        // Call insertion sort function
        insertionSort(numbers);

        // Print the sorted array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Insertion sort algorithm
    public static void insertionSort(int[] array) {
        int n = array.length;

        // Start from the second element, as the first element is already "sorted"
        for (int i = 1; i < n; i++) {
            // Store the current element to insert
            int currentElement = array[i];
            int j = i - 1;

            // Shift elements that are greater than the current element to the right
            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert the current element at the correct position
            array[j + 1] = currentElement;
        }
    }
}
