package Chapter_2;

/**
 * This program prints a grid to play tic-tac-toe.
 */
public class Exercise15 {
    public static void main(String[] args) {
        final String boardLine = "+----+----+----+\n";
        final String boardColumn = "|    |    |    |\n";

        System.out.print(boardLine + boardColumn + boardLine + boardColumn + boardLine + boardColumn + boardLine);
    }
}
