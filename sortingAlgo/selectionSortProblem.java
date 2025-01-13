package sortingAlgo;
public class selectionSortProblem {

    public static void main(String[] args) {
        
        int myNum[] = {12, 1, 32,67,98,34,23,99,109,5};

        selectionSort(myNum);

        for( int num : myNum){
            System.out.println(num + " ");
        }
    }

    public static void selectionSort(int[] array){
        int n = array.length;

        for(int i=0; i < n - 1; i++){
            int minimumIndex = i;

            for(int j = i + 1; j < n; j++ ){

                if(array[j] < array[minimumIndex]){
                    minimumIndex = j;
                }
            }

            int temp = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temp;
        }
    }
}
