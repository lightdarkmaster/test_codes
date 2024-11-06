package javaCode;

public class angle {

    public static void main(String[] args) {

        rightTriangle();
        leftTriangle();

    }

    public static void rightTriangle() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftTriangle() {

        // i for rows and j for columns
        // row denotes the number of rows you want to print
        int i, j, row = 10;
        // Outer loop work for rows
        for (i = 0; i < row; i++) {
            // inner loop work for space
            for (j = 2 * (row - i); j >= 0; j--) {
                // prints space between two stars
                System.out.print(" ");
            }
            // inner loop for columns
            for (j = 0; j <= i; j++) {
                // prints star
                System.out.print("* ");
            }
            // throws the cursor in a new line after printing each line
            System.out.println();
        }
    }

}
