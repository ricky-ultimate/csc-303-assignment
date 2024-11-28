public class StringManipulation {
    public static void main(String[] args) {
        // a) Declare/define two strings
        String str1, str2;

        // b) Assign values to the strings
        str1 = "Hello";
        str2 = "World";

        // c) Concatenate the two strings using a plus operator and show the output
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenatedString);

        // d) Print the second character of the first string
        char secondChar = str1.charAt(1);
        System.out.println("Second character of str1: " + secondChar);

        // e) Convert the first string into all uppercase
        String uppercaseStr = str1.toUpperCase();
        System.out.println("Uppercase str1: " + uppercaseStr);
    }
}