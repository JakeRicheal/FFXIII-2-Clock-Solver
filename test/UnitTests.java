import org.junit.jupiter.api.Test;
import java.util.Arrays;

/**
 * Some simple unit tests for the functionality of this program.
 */
public class UnitTests {

    @Test
    public void nullCheck() {
        ClockPuzzle nullPuzzle = null;
        int[] expected = null;
        int[] actual = Solver.solvePuzzle(nullPuzzle);
        assert(Arrays.equals(expected, actual));
    }

    //TODO: Run an auto-solver instead of using explicit expected arrays.

    @Test
    public void testSolveSimplePuzzle() {
        int[] vals = {1};
        ClockPuzzle puzzle = new ClockPuzzle(1, vals);
        int[] expected = {0};
        int[] actual = Solver.solvePuzzle(puzzle);
        assert(Arrays.equals(expected, actual));
    }

    @Test
    public void testUnsolvablePuzzle() {
        int[] vals = {2, 2, 2, 2};
        ClockPuzzle puzzle = new ClockPuzzle(4, vals);
        int[] expected = null;
        int[] actual = Solver.solvePuzzle(puzzle);
        assert(Arrays.equals(expected, actual));
    }
}
