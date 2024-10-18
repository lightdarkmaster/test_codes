public class tree {

    public static void main(String[] args) {
        int num[] = {1,45,2,67,23,89,189,24,90};

        bubblesort(num);
    }

    private static void bubblesort(int[] num) {

        int n = num.length;
        int i, j;
        boolean swapped = false;

        do{
            for(i=0; i<=n; i++){
                for(j=i; j<=n; j++){
                    System.out.println(num[i]);
                    swapped = true;
                }
            }
        }while(swapped = true);
    }
    
}
