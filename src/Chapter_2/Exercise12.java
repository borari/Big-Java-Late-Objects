package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program prompts the user for a drive, file path, file name, and extension, then prints the complete filename.
 */
public class Exercise12 {
    public static void main(String[] args) {
        // Prompt user for initial values
        String drive = JOptionPane.showInputDialog(null, "Enter the desired drive letter (C:).");
        String path = JOptionPane.showInputDialog(null, "Enter the desired file path (\\Users\\borari).");
        String fileName = JOptionPane.showInputDialog(null,"Enter the desired file name.");
        String fileExtension = JOptionPane.showInputDialog(null, "Enter the desired file extension (.txt).");

        // Print results
        JOptionPane.showMessageDialog(null, drive + path + "\\" + fileName + fileExtension);
    }
}
