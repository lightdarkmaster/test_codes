public class bubblesort {
    public static void main(String[] args) {
       
        int[] myNum = {100, 220, 30, 140, 3, 28};
        
     
        bubbleSort(myNum);
        

        System.out.println("Sorted Array:");
        for (int num : myNum) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        // Outer loop to control the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
