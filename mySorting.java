
public class mySorting {

    public static void main(String[] args) {
        int num[] = { 23,56,1,78,12,90,33,67,2};    

        mySortPackage sort = new mySortPackage();

        sort.myBubbleSort(num);
        
        for( int nums : num){
            System.out.println(nums);
        }
    }
    
}

