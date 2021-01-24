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

        int[] nodeVals = new int[size];

        //TODO: Verify these inputs.
        System.out.println("Now please enter the values at these " + size + "positions:");
        printSeparation();
        for (int i = 0; i < size; i++) {
            System.out.print("Value at position " + i + ": ");
            nodeVals[i] = scan.nextInt();
        }

        printSeparation();
        System.out.println("Excellent. One moment, please.");
        printSeparation();

        ClockPuzzle puzzle = new ClockPuzzle(size, nodeVals);


    }


    /**
     * Attempt to solve a Clock Puzzle.
     * @param puzzle The puzzle to be solved.
     * @return An array containing the positions in the order needed to solve, or null if unsolvable.
     */
    public static int[] solvePuzzle(ClockPuzzle puzzle) {
        return null;
    }

    /**
     * Print the same sequence of dashes for prettiness.
     */
    private static void printSeparation() {
        System.out.println("--------------------------");
    }

}
