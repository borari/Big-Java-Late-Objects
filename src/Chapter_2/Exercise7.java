package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program prompts the user for a radius and then prints:
 * The area and circumference of a circle with that radius.
 * The volume and surface area of a sphere with that radius.
 */
public class Exercise7 {
    public static void main(String[] args) {
        // Prompt user for a radius
        double radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter a radius."));

        // Set static vars and pre-calculations
        double rSquared = radius * radius;
        double rThird = Math.pow(radius, 3);

        // Perform calculations
        double circleArea = Math.PI * rSquared; // A = pi*r^2
        double circleCircumference = 2 * Math.PI * radius; // C = 2*pi*r
        double sphereVolume = 4/3 * Math.PI * rThird; // Vol = 4/3 * pi * r^3
        double sphereSurfaceArea = 4 * Math.PI * rSquared; // Sur. A = 4 * pi * r^2

        // Print results
        JOptionPane.showMessageDialog(null, "A circle with a radius of "+radius+" has the area and" +
                " circumference:\n  Area:    "+circleArea+"\n  Circumference:    "+circleCircumference+"\n\nA sphere with the" +
                " same radius has the volume and surface area:\n  Volume:    "+sphereVolume+"\n  Surface Area:    "+
                sphereSurfaceArea+"\n");
    }
}
