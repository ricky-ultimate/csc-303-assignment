import java.util.Scanner;

public class PasswordVerification {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String correctPassword = "some password";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter your password: ");
            
            String enteredPassword = input.nextLine();
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Login successful!");
                return; // Exit the program if the password is correct
            } else {
                System.out.println("You may have typed the wrong password, lets try that again!");
                attempts++;
            }
        }

        System.out.println("Too many incorrect attempts. Logging out...");
        System.exit(0); // Exit the program after 3 wrong attempts
    }
}