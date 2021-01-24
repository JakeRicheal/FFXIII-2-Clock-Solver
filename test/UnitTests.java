import org.junit.jupiter.api.Test;
import java.util.Arrays;

/**
 * Some simple unit tests for the functionality of this program.
 */
public class UnitTests {

    @Test
    public void simpleTest() {
        int[] vals1 = {1};
        ClockPuzzle puzzle1 = new ClockPuzzle(1, vals1);
        int[] actual = Solver.solvePuzzle(puzzle1);
        int[] expected = {0};
        boolean workedProperly = Arrays.equals(expected, actual);
        assert(workedProperly);
    }
}
