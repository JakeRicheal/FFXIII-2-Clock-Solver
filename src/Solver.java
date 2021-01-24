import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

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
        int[] solution = solvePuzzle(puzzle);
        if (solution == null) {
            System.out.println("It seems this puzzle has no solution. Make sure you've typed in the proper values.");
        } else {
            System.out.println("Puzzle Solved!");
            for (int step = 0; step < size; step++) {
                int pos = solution[step];
                int val = puzzle.getNodes()[pos].getNum();
                System.out.println("Select the " + val + " at position " + pos);
            }
            printSeparation();
            System.out.println("Have a nice day!!!");
            printSeparation();
        }
    }


    /**
     * Attempt to solve a Clock Puzzle.
     * @param puzzle The puzzle to be solved.
     * @return An array containing the positions in the order needed to solve, or null if unsolvable.
     */
    public static int[] solvePuzzle(ClockPuzzle puzzle) {
        if (puzzle == null) {
            return null;
        }
        //SOLVE! Start from 0 and keep going until you can't, then back up.
        // If you can't solve it starting from position 0, start from position 1.
        // If you can't solve it starting from anywhere, say so.
        Stack<Integer> solution = new Stack<Integer>();
        ClockNode[] nodes = puzzle.getNodes();
        for (int startPos = 0; startPos < puzzle.getSize(); startPos++) {
            ClockNode startNode = nodes[startPos];
            solution.push(startPos);
        }

        if (solution.empty()) {
            return null;
        }
        int[] solutionArray = new int[puzzle.getSize()];
        for (int i = puzzle.getSize() - 1; i >= 0; i--) {
            solutionArray[i] = solution.pop();
        }
        return solutionArray;
    }

    /**
     * Print the same sequence of dashes for prettiness.
     */
    private static void printSeparation() {
        System.out.println("--------------------------");
    }

}
