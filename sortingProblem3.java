public class sortingProblem3 {

    public static void main(String[] args) {
        
        int myNum[] = {12,5,23,89,34,67,9,0,1,93,456,2331,56,72};

        bubbleSort(myNum);

        for(int numbers : myNum){
            System.out.println(numbers + " ");
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
    
}
