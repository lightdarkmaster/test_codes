import java.util.Scanner;


public class guessthenumber {

    public static void main(String[] args) {

        int guessed;
        int correct_answer;
        
        try (Scanner input = new Scanner(System.in)) {
            do{
                System.out.println("Enter a number to be guess : ");
                correct_answer = input.nextInt();

                if(correct_answer > 10){
                    System.out.println("the number should not be greater than 10");
                    System.out.println("Enter a number to be guess : ");
                    correct_answer = input.nextInt();
                }else if(correct_answer < 1){
                    System.out.println("The number should not be less than 1");
                    System.out.println("Enter a number to be guess : ");
                    correct_answer = input.nextInt();
                }
            }while(correct_answer > 10 || correct_answer < 1 );


            do{
                System.out.println("Enter your guess number : ");
                guessed = input.nextInt();

                if(guessed == correct_answer){
                    System.out.println("You got the correct answer!! Congrats");
                }else if(guessed > correct_answer){
                    System.out.println("Your answer is a little bit higher");
                    System.out.println("Enter your guess number : ");
                    guessed = input.nextInt();
                }else if(guessed < correct_answer){
                    System.out.println("Your answer is a little bit lower");
                    System.out.println("Enter your guess number : ");
                    guessed = input.nextInt();
                }
            }while(guessed > correct_answer || guessed < correct_answer);
        }
    }
    
}
