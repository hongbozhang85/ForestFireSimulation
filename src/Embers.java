import java.util.ArrayList;

/**
 * Created by hongbo on 17-2-23.
 */
public class Embers {

    ArrayList<Ember> emberArray;
    private int numOfEmber;
    //private Forest forest; // since fired tree will emit embers, so embers will contains forest.

    Embers() {
        numOfEmber = 0;
        emberArray = new ArrayList<>();
    }

    public void generate(Forest forest, int time) {
        // from external, only convection, no diffusion. 2.5 embers per second
        if ( time % 2 == 0 ) {
            emberArray.add(new Ember(100,10,0,forest));
            emberArray.add(new Ember(120,10,0,forest));
            emberArray.add(new Ember(140,10,0,forest));
        } else {
            emberArray.add(new Ember(110,10,0,forest));
            emberArray.add(new Ember(130,10,0,forest));
        }
        // from treelotsfire. 1 ember per second per treelotsfire
        for ( Tree t : forest.getTrees().getTreesArray() ) {
            if ( t.getStates() == 2 ) {
                emberArray.add(new Ember(t.getPosition().x(),t.getPosition().y(),1,forest));
            }
        }
    }

    public void evolution() {
        for ( Ember e : emberArray ) {
            double currentX = e.getPosition().x();
            double currentY = e.getPosition().y();
            double nextX = currentX + 1 * e.getSpeed().x();
            double nextY = currentY + 1 * e.getSpeed().y();
            e.setPosition(nextX, nextY);
        }
    }

    public int getNumOfEmber() {
        return numOfEmber;
    }

    /**
     * Get the value of emberArray
     * @return the value of emberArray
     */
    public ArrayList<Ember> getEmberArray () {
        return emberArray;
    }

}
