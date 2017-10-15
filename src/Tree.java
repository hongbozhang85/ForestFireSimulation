/**
 * Created by hongbo on 17-2-22.
 */
public class Tree extends Item {

    private int states; // 0 no fire, 1 some fire, 2 lots fire, 3 burnt
    private Show drawTree;
    private int emberPassBy;

    Tree (double x, double y) {
        super(x, y);
        super.radius = 50;
        states = 0;
        drawTree = new ShowTreeNoFire(super.position);
        emberPassBy = 0;
    }

    public void countEmberTreeState(Embers embers) {
        // count how manty embers pass by a tree
        // consider both # of embers and time duration of an ember stay on a tree.
        double emberR = embers.getEmberArray().get(0).getRadius();
        for ( Ember e : embers.getEmberArray() ) {
            if ( Cartesian.distance(e.getPosition(), position) < (emberR + radius) ) {
                emberPassBy++;
            }
        }
        // change tree state according to that number.
        if ( emberPassBy > 20 && emberPassBy <= 50 ) {
            states = 1;
            setDrawTree(new ShowTreeSomeFire(super.position));
        } else if ( emberPassBy > 50 && emberPassBy <= 200 ) {
            states = 2;
            setDrawTree(new ShowTreeLotFire(super.position));
        } else if ( emberPassBy > 200 ) {
            states = 3;
            setDrawTree(new ShowTreeBurnt(super.position));
        }
    }

    /**
     * Set the value of states
     * @param newVar the new value of states
     */
    public void setStates (int newVar) {
        states = newVar;
    }

    /**
     * Get the value of states
     * @return the value of states
     */
    public int getStates () {
        return states;
    }

    /**
     * Set the value of drawTree
     * @param newVar the new value of drawTree
     */
    public void setDrawTree (Show newVar) {
        drawTree = newVar;
    }

    /**
     * Get the value of drawTree
     * @return the value of drawTree
     */
    public Show getDrawTree () {
        return drawTree;
    }

    /**
     * Set the value of emberPassBy
     * @param newVar the new value of emberPassBy
     */
    public void setEmberPassBy (int newVar) {
        emberPassBy = newVar;
    }

    /**
     * Get the value of emberPassBy
     * @return the value of emberPassBy
     */
    public int getEmberPassBy () {
        return emberPassBy;
    }

}