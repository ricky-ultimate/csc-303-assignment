/*
    Using scanner class design a simple calculator that'll calculate the area of a circle, triangle, square and rectangle.
*/

import java.util.Scanner;

public class ScannerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            running = handleChoice(choice, scanner);
        }

        scanner.close();
    }

    // Display menu options
    private static void displayMenu() {
        System.out.println("\nSimple Area Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.println("4. Rectangle");
        System.out.println("5. Exit");
        System.out.print("Choose an option (1-5): ");
    }

    // Handle user choice
    private static boolean handleChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1 -> { // Circle
                Circle circle = new Circle();
                circle.calculateArea(scanner);
            }
            case 2 -> { // Triangle
                Triangle triangle = new Triangle();
                triangle.calculateArea(scanner);
            }
            case 3 -> { // Square
                Square square = new Square();
                square.calculateArea(scanner);
            }
            case 4 -> { // Rectangle
                Rectangle rectangle = new Rectangle();
                rectangle.calculateArea(scanner);
            }
            case 5 -> { // Exit
                return false;
            }
            default -> System.out.println("Invalid choice. Please choose a valid option.");
        }
        return true;
    }
}

// Utility class to encapsulate shape area calculations
class Shapes {
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateRectangleArea(double length, double breadth) {
        return length * breadth;
    }
}

// Circle class
class Circle {
    public void calculateArea(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Shapes.calculateCircleArea(radius);
        System.out.printf("The area of the circle is: %.2f\n", area);
    }
}

// Triangle class
class Triangle {
    public void calculateArea(Scanner scanner) {
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = Shapes.calculateTriangleArea(base, height);
        System.out.printf("The area of the triangle is: %.2f\n", area);
    }
}

// Square class
class Square {
    public void calculateArea(Scanner scanner) {
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double area = Shapes.calculateSquareArea(side);
        System.out.printf("The area of the square is: %.2f\n", area);
    }
}

// Rectangle class
class Rectangle {
    public void calculateArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        double area = Shapes.calculateRectangleArea(length, breadth);
        System.out.printf("The area of the rectangle is: %.2f\n", area);
    }
}
