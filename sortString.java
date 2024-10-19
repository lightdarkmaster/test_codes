public class sortString {

    public static void main(String[] args) {
        
        String[] names = {"Arnold","Michael","Aaron","Zayn","Gilbert","XouYin","Bert"};

        sortName(names);

        for( String name : names){
            System.out.println(name);
        }

    }

    public static void sortName(String[] array){

        int n = array.length;
        boolean swapped;

        for(int i=0; i < n - 1; i++){
            swapped = false;

            for(int j=0; j < n - 1 - i; j++){

                if(array[j].compareTo(array[j + 1]) > 0);

                String temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                swapped = true;
            }
            if(!swapped){
                break;
            }
        }
    }
    
}
