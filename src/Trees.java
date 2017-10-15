import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hongbo on 17-2-23.
 */
public class Trees {

    private static final int WIDTH = 1366 - 200;
    private static final int HEIGHT = 768 - 200;
    Random ran = new Random();
    ArrayList<Tree> treesArray;
    private int numOfTree;

    Trees (int num) {
        numOfTree = num;
        treesArray = new ArrayList<>(num);
        double x = 100 + ran.nextDouble() * WIDTH;
        double y = 100 + ran.nextDouble() * HEIGHT;
        treesArray.add(new Tree(x, y));
        int i = 1;
        while ( i < num ) {
            x = 100 + ran.nextDouble() * WIDTH;
            y = 100 + ran.nextDouble() * HEIGHT;
            if ( tooClose(x,y,treesArray) ) {
                treesArray.add(new Tree(x, y)); // tree can overlap with other tree.
                i++;
            }
        }
    }

    /**
     *
     * @param x
     * @param y
     * @param treesArray
     * @return false -> trees will overlap, true -> trees are well seperated.
     */
    private static boolean tooClose(double x, double y, ArrayList<Tree> treesArray) {
        Cartesian tmp = new Cartesian(x,y);
        double dis = treesArray.get(0).getRadius();
        for ( Tree t : treesArray) {
            if ( Cartesian.distance(tmp, t.getPosition()) < dis ) return false;
        }
        return true;
    }

    public void changStates(Embers embers) {
        for ( Tree t : treesArray ) {
            t.countEmberTreeState(embers);
        }
    }

    /**
     * Get the value of treesArray
     * @return the value of treesArray
     */
    public ArrayList<Tree> getTreesArray () {
        return treesArray;
    }

    /**
     * Set the value of numOfTree
     * @param newVar the new value of numOfTree
     */
    private void setNumOfTree (int newVar) {
        numOfTree = newVar;
    }

    /**
     * Get the value of numOfTree
     * @return the value of numOfTree
     */
    public int getNumOfTree () {
        return numOfTree;
    }

}
