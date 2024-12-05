import javax.swing.*;

public class JoptionCalculator {

    public static void main(String[] args) {
        while (true) {
            // Shape selection menu
            String[] options = {"Circle", "Triangle", "Square", "Rectangle", "Exit"};
            String shape = (String) JOptionPane.showInputDialog(
                    null,
                    "Select a shape to calculate its area:",
                    "Shape Calculator",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            if (shape == null || shape.equals("Exit")) {
                JOptionPane.showMessageDialog(null, "Thank you for using the Shape Calculator!");
                break;
            }

            try {
                double area = 0.0;

                switch (shape) {
                    case "Circle" -> {
                        String radiusInput = JOptionPane.showInputDialog("Enter the radius of the circle:");
                        double radius = Double.parseDouble(radiusInput);
                        area = Math.PI * radius * radius;
                    }
                    case "Triangle" -> {
                        String baseInput = JOptionPane.showInputDialog("Enter the base of the triangle:");
                        double base = Double.parseDouble(baseInput);
                        String heightInput = JOptionPane.showInputDialog("Enter the height of the triangle:");
                        double height = Double.parseDouble(heightInput);
                        area = 0.5 * base * height;
                    }
                    case "Square" -> {
                        String sideInput = JOptionPane.showInputDialog("Enter the side of the square:");
                        double side = Double.parseDouble(sideInput);
                        area = side * side;
                    }
                    case "Rectangle" -> {
                        String lengthInput = JOptionPane.showInputDialog("Enter the length of the rectangle:");
                        double length = Double.parseDouble(lengthInput);
                        String widthInput = JOptionPane.showInputDialog("Enter the width of the rectangle:");
                        double width = Double.parseDouble(widthInput);
                        area = length * width;
                    }
                }

                JOptionPane.showMessageDialog(null,
                        String.format("The area of the %s is: %.2f", shape, area),
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Invalid input. Please enter valid numbers.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}