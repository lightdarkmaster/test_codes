public class sSort{
    
    public static void main(String[] args){

        int myNum[] = {12,56,89,345,2,0,23,1,67,3,7,4,33,23};

        selectionSort(myNum);

        for( int num : myNum){
            System.out.println(num + " ");
        }
    }

    public static void selectionSort(int[] array){

        int arrayLength = array.length;

        for(int i=0; i < arrayLength - 1; i++){
            int minimumIndex = i;

            for(int j = i + 1; j < arrayLength; j++){
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