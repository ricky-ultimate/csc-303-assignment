import java.util.Scanner;

public class Calculator {

    // Function for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function for division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return 'Not a Number' to signify an error
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operation) {
            case '+' -> result = add(num1, num2);
            case '-' -> result = subtract(num1, num2);
            case '*' -> result = multiply(num1, num2);
            case '/' -> result = divide(num1, num2);
            default -> {
                System.out.println("Invalid operation.");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}
