
public class mySortStringProblem {

    public static void main(String[] args) {
        
        String[] myNames = {"Aaron", "Lebron", "Bronny","Brian", "Derrick","Kyrie"};

        //if I am using a non static function
        System.out.println("When using Non-Static function from my package");
        myStringSortPackage srt = new myStringSortPackage();
        srt.stringSort(myNames);

        //System.out.println("When I am using a Static function");
        //myStringSortPackage.sortStringDoWhile(myName1s);
        
        for( String name : myNames){
            System.out.println(name + " ");
        }


    }
    
}
