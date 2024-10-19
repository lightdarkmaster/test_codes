
public class mySortStringProblem {

    public static void main(String[] args) {
        
        String[] myNames = {"Aaron", "Lebron", "Bronny","Brian", "Derrick","Kyrie"};

        myStringSortPackage srt = new myStringSortPackage();

        srt.sortStringDoWhile(myNames);
        
        for( String name : myNames){
            System.out.println(name + " ");
        }


    }
    
}
