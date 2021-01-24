/**
 * A clock puzzle is represented here as a [structure] of clock nodes. Each node is linked to the ones
 *  at positions plus and minus its number, modulo the puzzle size (number of nodes).
 */
public class ClockPuzzle {

    /**
     * The number of clock nodes in this puzzle.
     */
    private final int size;

    /**
     * The Clock Nodes within this Clock Puzzle.
     */
    private ClockNode[] nodes;

    /**
     * Constructor for a Clock Puzzle.
     * @param size The number of nodes in this puzzle.
     * @param nodeVals An array of 'size' node values.
     */
    public ClockPuzzle(int size, int[] nodeVals) {
        this.size = size;
        this.nodes = new ClockNode[this.size];
        for (int pos = 0; pos < this.size; pos++) {
            this.nodes[pos] = new ClockNode(pos, nodeVals[pos]);
        }
    }
}
