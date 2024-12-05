/*
    Write a program using the  JOptionPane that'll accept and print your courses for this semester.
*/

import javax.swing.*;

public class CourseList {
    public static void main(String[] args) {
        // Array to store courses
        String[] courses = new String[5]; // Adjust the size if you have more or fewer courses
        StringBuilder courseList = new StringBuilder("Your courses for this semester:\n");

        // Prompt user for courses
        for (int i = 0; i < courses.length; i++) {
            String course = JOptionPane.showInputDialog("Enter the name of course " + (i + 1) + ":");

            // If the user cancels the input, exit the program
            if (course == null || course.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No course entered. Exiting program.");
                return;
            }

            courses[i] = course;
        }

        // Build a string containing all courses
        for (String course : courses) {
            courseList.append(course).append("\n");
        }

        // Show the list of courses
        JOptionPane.showMessageDialog(null, courseList.toString(), "Courses for This Semester", JOptionPane.INFORMATION_MESSAGE);
    }
}
