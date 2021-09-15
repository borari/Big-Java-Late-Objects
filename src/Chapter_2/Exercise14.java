package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program reads a number between 1000 and 999999 from the user and prints it with a comma separating the thousands.
 */
public class Exercise14 {
    public static void main(String[] args){
        // Prompt user for init value
        String userNumber = JOptionPane.showInputDialog(null, "Enter an integer between 1000 and 999999.");

        int n = userNumber.length();
        String str = userNumber.substring(0, n-3);
        String str2 = userNumber.substring(n-3, n);

        String cleanUserNumber = str+","+str2;

        JOptionPane.showMessageDialog(null, cleanUserNumber);
    }
}
