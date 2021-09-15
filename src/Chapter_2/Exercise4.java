package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program prompts the user for two integers then prints the: sum, difference, product, average,
 * distance, maximum, and minimum.
 */
public class Exercise4 {
    public static void main(String[] args) {
        // Prompt user for the init numbers
        double numOne = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your first desired number."));
        double numTwo = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your second desired number."));

        // Declare static variables
        int numCount = 2; // Amount of numbers entered by user.

        // Perform calculations
        double sum = numOne + numTwo;
        double difference = numOne - numTwo;
        double product = numOne * numTwo;
        double average = product / numCount;
        double distance = Math.abs(difference);
        double maximum = Math.max(numOne, numTwo);
        double minimum = Math.min(numOne, numTwo);

        // Print results.
        JOptionPane.showMessageDialog(null, "Your entered numbers were " + numOne + " and " +
                numTwo + ".\r\nThe sum of these numbers is:  " + sum + ".\r\nThe difference of these numbers is:  " +
                difference + ".\r\nThe product of these numbers is:  " + product + ".\r\nThe average of these numbers is:  " +
                average + ".\r\nThe distance between these numbers is:  " + distance + "\r\nThe maximum number is this set is:  " +
                maximum + ".\r\nThe minimum number in this set is:  " + minimum + ".\r\n");
    }
}
