/**
 * A 'Node' on the clock puzzle has a position on the clock face and a number.
 *  The number implicitly links this node to the nodes at positions plus and minus that number.
 */
public class ClockNode {

    /**
     * This node's position on the clock face.
     */
    private final int pos;

    /**
     * This node's number value.
     */
    private final int num;

    public ClockNode(int pos, int num) {
        this.pos = pos;
        this.num = num;
    }
}
