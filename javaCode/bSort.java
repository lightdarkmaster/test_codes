package javaCode;

public class bSort {
    
    public static void main(String[] args) {
        
        int myNum[] = {23,56,89,2,6,90,87,43,11,8,100};

        doWhile(myNum);
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

    public static void doWhile(int[] array){
        int n = array.length;
        boolean swapped;

        do{

            for( int i = 0; i < n; i++){
                swapped = false;
                for(int j = 0; j < n -1 - i; j++){

                    if(array[j] > array[j + 1]){
                        
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
            }

        }while(swapped = false);

        //number of nodes inside an arraylist

        System.out.println("number of arrays list : " + n);
    }
}
