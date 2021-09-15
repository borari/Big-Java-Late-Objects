package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program reads a number and displays its square, cube, and fourth power.
 */
public class Exercise3 {
    public static void main(String[] args) {
        // Prompt user for init number
        double number = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter a number."));

        // Perform power calculations
        double squarePower = number * number;
        double thirdPower = number * number * number;
        double fourthPower = Math.pow(number, 4);

        // Print results
        JOptionPane.showMessageDialog(null, "Your entered number was " + number + ".\r\nThe square power of " + number + " is " + squarePower + ".\r\nThe third power of " + number + " is " + thirdPower + ".\r\nThe fourth power of " + number + " is "+ fourthPower + ".");
    }
}
