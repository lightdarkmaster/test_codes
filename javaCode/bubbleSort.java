package javaCode;

public class bubbleSort {

    public static void main(String[] args) {
        int myNum[] = {12,78,3,45,122,56,2,4,11,99,67,900,23};

        bubbleSort(myNum);

        for(int num : myNum){
            System.out.print(num + " ");
        }
        
    }
    
    public static void bubbleSort(int[] array){

        int arrayLength = array.length;
        boolean swapped;

        for(int i=0; i < arrayLength; i++){
            swapped = false;

            for(int j=0; j < arrayLength - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
