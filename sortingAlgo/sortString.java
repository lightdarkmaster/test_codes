package sortingAlgo;
public class sortString {

    public static void main(String[] args) {
        
        String[] names = {"Arnold", "Michael", "Aaron", "Zayn", "Gilbert", "XouYin", "Bert","Zayne","Itachi"};

        // Call the sortName method to sort the array
        sortName(names);

        // Print the sorted array
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void sortName(String[] array) {
        int n = array.length;
        boolean swapped;

        // Outer loop to control the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                // Use compareTo to compare strings lexicographically
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap if the current string is greater than the next one
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
