/**
 * Created by hongbo on 17-2-23.
 */
public class Forest {

    private Cartesian wind;
    private Trees trees;
    private Embers embers;

    Forest (Cartesian wind, Trees trees, Embers embers) {
        this.wind = wind;
        this.trees = trees;
        this.embers = embers;
    }

    /**
     * Set the value of wind
     * @param newVar the new value of wind
     */
    public void setWind (Cartesian newVar) {
        wind = newVar;
    }

    /**
     * Get the value of wind
     * @return the value of wind
     */
    public Cartesian getWind () {
        return wind;
    }

    /**
     * Set the value of trees
     * @param newVar the new value of trees
     */
    public void setTrees (Trees newVar) {
        trees = newVar;
    }

    /**
     * Get the value of trees
     * @return the value of trees
     */
    public Trees getTrees () {
        return trees;
    }

    /**
     * Set the value of embers
     * @param newVar the new value of embers
     */
    public void setEmbers (Embers newVar) {
        embers = newVar;
    }

    /**
     * Get the value of embers
     * @return the value of embers
     */
    public Embers getEmbers () {
        return embers;
    }

}
