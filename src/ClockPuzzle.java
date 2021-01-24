/**
 * A clock puzzle is represented here as a [structure] of clock nodes. Each node is linked to the ones
 *  at positions plus and minus its number, modulo the puzzle size (number of nodes).
 */
public class ClockPuzzle {

    /**
     * The number of clock nodes in this puzzle.
     */
    private final int size;

    public ClockPuzzle(int size) {
        this.size = size;
    }
}
