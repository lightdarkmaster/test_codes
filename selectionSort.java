public class selectionSort {

    public static void main(String[] args) {
        int[] myNum = {12, 4, 2, 56, 14, 89, 1, 98, 11};

        // Call selection sorting method
        selectionSorting(myNum);

        // Print the sorted array
        for (int num : myNum) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSorting(int[] array) {
        int n = array.length;

        // Outer loop to move through the unsorted part of the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current element is the minimum
            int minIndex = i;

            // Inner loop to find the smallest element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Update the index of the minimum element
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
