package sortingAlgo;
public class sort{

    public static void main(String[] args) {
        
        int myNum[] = {23,34,26,78,90,12,6,2,33,48};

        anotherSort(myNum);
        //bubbleSort(myNum);

        for(int num : myNum){
            System.out.println(num + " ");
        }
    }

    public static void bubbleSort(int[] array){

        int n = array.length;
        boolean swapped;

        for(int i=0; i < n - 1; i++){
            swapped = false;

            for(int j=0; j < n - 1 - i; j++){
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

    public static void anotherSort(int[] array){

        int length = array.length;
        boolean swap;

        do{
            for(int i=0; i < length - 1; i++){
                swap = false;
                for(int j=0; j < length - 1 - i; j++){
                    if(array[j] > array[j + 1]){

                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swap = true;
                    }
                }
                if(!swap){
                    return;
                }
            }

        }while(swap = true);
    }

}