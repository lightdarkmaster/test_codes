import java.util.Scanner;

class simplecalcuator{
    
    public static void main(String[] args){
        
        double num1, num2, difference, sum, product, quotient;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Num1: ");
            num1 = input.nextDouble();

            System.out.println("Enter Num2: ");
            num2 = input.nextDouble();
        }

        sum = num1 + num2;
        System.out.println("Sum: " + sum);

        difference = num1 - num2;
        System.out.println("Difference: " + difference);

        product = num1 * num2;
        System.out.println("Product: " + product);

        quotient = num1 / num2;
        System.out.println("Quotient: " + quotient);

    
    }
}
