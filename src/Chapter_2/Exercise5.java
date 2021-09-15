package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program prompts the user for two integers then prints the sum, difference, product, average,
 * distance, maximum, and minimum in a right-aligned list to the console.
 */
public class Exercise5 {
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
        System.out.printf("""
                Your entered numbers were %.2f and %.2f.\r
                Sum:%15.2f\r
                Difference:%8.2f\r
                Product:%11.2f\r
                Average:%11.2f\r
                Distance:%10.2f\r
                Maximum:%11.2f\r
                Minimum:%11.2f\r
                """, numOne, numTwo, sum, difference, product, average, distance, maximum, minimum);
    }
}
