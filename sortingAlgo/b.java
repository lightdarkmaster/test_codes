package sortingAlgo;
public class b {
    
    public static void main(String[] args) {
        
        int numList[] = {12, 34,56,1,2,98,3,9,10};

        bsort(numList);

        for(int num : numList){
            System.out.print(num + " ");

        }
    }

    public static void bsort(int[] array){

        int n = array.length;
        boolean swapped;


        for(int i=0; i < n - 1; i++){
            swapped = false;

            for(int j=0; j< n - 1; j++){

                if(array[j] < array[j + 1]){
                    
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    temp = array[j];
                    swapped = true;
                }
            }if(!swapped){
                break;
            }
        }
    }
}
