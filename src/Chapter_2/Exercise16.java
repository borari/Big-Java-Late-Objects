package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program reads an integer and breaks it into a sequence of individual digits. You may assume that the input has no
 * more than five digits and is not negative.
 */
public class Exercise16 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number between 0 and 99999."));

        int first = number / 10000;
        number = number % 10000;

        int second = number / 1000;
        number = number % 1000;

        int third = number / 100;
        number = number % 100;

        int fourth = number / 10;
        number = number % 10;

        int fifth = number;

        JOptionPane.showMessageDialog(null, first + " " + second + " " + third + " " + fourth + " " + fifth);
    }
}
