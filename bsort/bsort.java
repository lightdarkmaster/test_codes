class bsort{
    public static void main(String[] args) {
        // Initialize an array of integers
        int numList[] = {12,4,45,6,1,6,99,100,9,19,22};

        // Call the sorting method
        sorting(numList);

        // Print the sorted array
        for(int num : numList){
            System.out.println(num + " ");
        }
    }


    public static void sorting(int[] array){
        // Store the length of the array
        int arrayLength = array.length;
        // Initialize a flag to track if a swap has occurred
        boolean swapped;

        // Iterate through the array
        for(int i =0; i < arrayLength; i++){
            // Set the flag to false
            swapped = false;

            // Iterate through the array from the current index to the end
            for(int j = 0; j < arrayLength - 1 - i; j++){
                // If the current element is greater than the next element
                if(array[j] > array[j + 1]){
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // Set the flag to true
                    swapped = true;
                }
            }
            // If no swaps have occurred, the array is sorted, so break out of the loop
            if(!swapped){
                break;
            }
        }
    }
}
