import java.util.Scanner;

public class StringManipulation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Character at a specific index
        char charAtIndex3 = str.charAt(3);
        System.out.println("Character at index 3: " + charAtIndex3);

        // Substring extraction
        String substring = str.substring(2, 5);
        System.out.println("Substring from index 2 to 4: " + substring);

        // Checking if the string starts with a specific substring
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        scanner.close();
    }
}