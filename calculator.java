import java.util.Scanner;


public class calculator {
    
    public static void main(String[] args){

        System.out.println("Calculator Terminal in Java");

        try (Scanner input = new Scanner(System.in)) {
            
            double num1, num2, sum, difference, product, quotient;

            System.out.println("Enter num1: ");
            num1 = input.nextDouble();

            System.out.println("Enter Second Number: ");
            num2 = input.nextDouble();

            sum = num1 + num2;
            System.out.println("The Sun of the two nunbers is : "+ sum);

            difference = num1 - num2;
            System.out.println("The Difference of the Two number is : " + difference);

            product = num1 * num2;
            System.out.println("The product of the two number is : "+ product);

            quotient = num1 / num2;
            System.out.println("The quotient of the two number is : " + quotient);

        }
    }
}
