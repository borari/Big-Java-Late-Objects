package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program reads a number between 1,000 and 999,999 from the user, where the user enters a comma in the input, then
 * prints the number without a comma.
 */
public class Exercise13 {
    public static void main(String[] args) {
        // Prompt the user for init value
        String userNumber = JOptionPane.showInputDialog(null, "Enter an integer between 1,000 and 999,999.");

        int n = userNumber.length();
        String str = userNumber.substring(0, n-4);
        String str2 = userNumber.substring(n-3, n);

        int cleanUserNumber = Integer.valueOf(str + str2);

        JOptionPane.showMessageDialog(null, cleanUserNumber);

    }
}
