package Chapter_2;
import javax.swing.JOptionPane;

/**
 * This program reads two times in military format and prints the number of hours and minutes between the two times.
 */
public class Exercise17 {
    public static void main(String[] args) {
        final int MINUTES_PER_DAY = 1440;
        final int MINUTES_PER_HOUR = 60;

        String firstTime = JOptionPane.showInputDialog(null, "Enter the first time, in military format.");
        String secondTime = JOptionPane.showInputDialog(null, "Enter the second time, in military format.");

        int firstTimeHours = Integer.parseInt(firstTime.substring(0, 2));
        int firstTimeMinutes = Integer.parseInt(firstTime.substring(2));
        int firstTimeAllMinutes = firstTimeHours * MINUTES_PER_HOUR + firstTimeMinutes; // 540

        int secondTimeHours = Integer.parseInt(secondTime.substring(0, 2));
        int secondTimeMinutes = Integer.parseInt(secondTime.substring(2));
        int secondTimeAllMinutes = secondTimeHours * MINUTES_PER_HOUR + secondTimeMinutes; // 1050

        int differenceInMinutes = secondTimeAllMinutes - firstTimeAllMinutes; // 510
        int totalMinutes = (MINUTES_PER_DAY + differenceInMinutes) % MINUTES_PER_DAY; // 510
        int totalHours = totalMinutes / MINUTES_PER_HOUR; // 8
        totalMinutes = totalMinutes % MINUTES_PER_HOUR; // 30

        JOptionPane.showMessageDialog(null, totalHours + " Hours " + totalMinutes + " Minutes "
        );
    }
}