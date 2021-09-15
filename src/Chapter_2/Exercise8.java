package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program prompts for the length and width of a rectangle then prints:
 * The area and perimeter of the rectangle.
 * The length of the diagonal.
 */
public class Exercise8 {
    public static void main(String[] args) {
        // Prompt user for init length and width values
        double length = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of " +
                "the rectangle."));
        double width = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the width of " +
                "the rectangle."));

        // Perform calculations
        double area = width * length; // A = wl
        double perimeter = 2 * (length + width); // P = 2(l+w)
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2)); // d = sqrt(l^2 + w^2)

        // Print the results
        JOptionPane.showMessageDialog(null, "A rectangle of length "+length+" and width: "+width+" has:\n" +
                "    Area:        "+area+"\n    Perimeter:        "+perimeter+"\n    Diagonal:        "+diagonal+"\n");
    }
}
