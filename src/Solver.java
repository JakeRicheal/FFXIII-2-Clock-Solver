import java.util.Scanner;

/**
 * The driver class to create and solve a clock puzzle.
 */
public class Solver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the puzzle.");
        boolean validSize = false;
        String sizeString = scan.nextLine();
        int size = 0;

        while (!validSize) {
            try {
                size = Integer.parseInt(sizeString);
                if (size > 0) {
                    validSize = true;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number for the size of the puzzle.");
            }
        }

        System.out.println("Now please enter the values at these " + size + "positions:");
        System.out.println("--------------------------");
    }
}
