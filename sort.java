public class sort{


    public static void main(String[] args){

        int myNum[] = {12,45,1,34,89,21,2};

        bubbleSort(myNum);

        for( int num : myNum){
            System.out.println(num + " ");
        }

    }

    public static void bubbleSort( int[] array){
        
        int n = array.length;
        boolean swapped;

        for(int i=0; i < n - 1; i++){
            swapped = false;
            
            for(int j=0; j < n - 1 - i; j++){
                if( array[j] > array[j + 1]){
                    
                    int temp = array[j+ 1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
        }
    }
}