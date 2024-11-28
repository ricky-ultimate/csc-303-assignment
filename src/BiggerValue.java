import java.util.Scanner;

public class BiggerValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int value1 = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int value2 = scanner.nextInt();

        int biggerValue = Math.max(value1, value2);

        System.out.println("The bigger value is: " + biggerValue);

        scanner.close();
    }
}