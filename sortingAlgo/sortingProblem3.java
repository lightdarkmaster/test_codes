package sortingAlgo;
public class sortingProblem3 {

    public static void main(String[] args) {
        
        int myNum[] = {12,5,23,89,34,67,9,0,1,93,456,2331,56,72};

        int myNum2[] = {34,23,67,27,87,33,56,111,90,3,66,78,55,555,2};

        bubbleSort(myNum);

        selectionSort(myNum2);


        for(int numbers : myNum){
            System.out.println(numbers + " ");
        }

        for(int numbers2 : myNum2){
            System.out.println("Output 2:  " + numbers2 + " ");
        }
    }

    public static void bubbleSort(int[] array){

        int arrayLength = array.length;
        boolean swapped;


        for(int i=0; i < arrayLength; i++){
            swapped = false;

            for(int j = 0; j < arrayLength - 1; j++){
                if(array[j] < array[j + 1]){
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }if(!swapped){
                break;
            }
        }
    }

    public static void selectionSort(int[] array){

        int n = array.length;

        for(int i = 0; i < n; i++){
            int minimumIndex = i;

            for(int j = i + 1; j < n; j++){

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
