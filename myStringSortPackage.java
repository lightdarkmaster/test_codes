public class myStringSortPackage {
    
    public void stringSort(String[] array){


        int stringLength = array.length;
        boolean swappedString;

        for(int i = 0; i < stringLength - 1; i++){
            swappedString = false;

            for(int j = 0; j < stringLength - 1 - i; j++){

                if(array[j].compareToIgnoreCase(array[j + 1]) > 0){

                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swappedString = true;
                }
                if(!swappedString){
                    return;
                }
            }
        }
    }


    public static void sortStringDoWhile(String[] array){
        int n = array.length;
        boolean swapped;

        do{

            for(int i = 0; i < n -1; i++){
                swapped = false;

                for(int j = 0; j < n -1 - i; j++){
                    
                    if(array[j].compareToIgnoreCase(array[j + 1]) > 0){
                        
                        String tempString = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tempString;
                        swapped = true;
                    }
                }
            }

        }while(swapped=false);
    }
}
