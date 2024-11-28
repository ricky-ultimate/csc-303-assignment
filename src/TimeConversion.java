import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, " + remainingSeconds + " seconds");

        scanner.close();
    }
}