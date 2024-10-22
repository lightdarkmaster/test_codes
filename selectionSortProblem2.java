public class selectionSortProblem2 {

    public static void main(String[] args) {
        int myNum[] = {12,45,2,1,56,89,456,33,5,89,8};

        for( int num : myNum){
            System.out.println(num + " ");
        }
    }

    public static void selectSort(int[] array){

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
