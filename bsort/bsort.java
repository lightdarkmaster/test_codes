class bsort{
    public static void main(String[] args) {
        int numList[] = {12,4,45,6,1,6,99,100,9,19,22};

        sorting(numList);

        for(int num : numList){
            System.out.println(num + " ");
        }
    }


    public static void sorting(int[] array){
        int arrayLength = array.length;
        boolean swapped;

        for(int i =0; i < arrayLength; i++){
            swapped = false;

            for(int j = 0; j < arrayLength - 1 - i; j++){
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