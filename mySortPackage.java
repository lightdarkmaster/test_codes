public class  mySortPackage {

    public void myBubbleSort(int[] array){

        int n = array.length;
        boolean swapped;

        for(int i=0; i < n -1; i++){
            swapped = false;

            for(int j=0; j < n - 1 - i; j++){
                if(array[j] > array[j + 1]){

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;

                }
            } if(!swapped){
                return;
            }
        }
    }
    
}
