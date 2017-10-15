import java.util.Random;

/**
 * Created by hongbo on 17-2-23.
 */

// this is the simplest forest fire model, in which diffusion velocity is a constant and isotropic.
// more sophisticated treatment should include the direction dependency, since the status of
// neighbor trees will affect diffusion velocity
public class Ember extends Item {

    Random ran = new Random();
    private double diffusion;
    private Cartesian speed;
    private ShowEmber drawEmber;
    private int source;
    // 0 from out of field; 1 from treelotsfire. assuming treesomefire and treeburnt don't emit ember.
    private Forest forest;

    Ember(double x, double y, int source, Forest forest) {
        super(x,y);
        super.radius = 5;
        this.source = source;
        if ( source == 0 ) {
            diffusion = 0.0;
        } else {
            diffusion = 20;
        }
        drawEmber = new ShowEmber(super.position);
        this.forest = forest;
        double theta = ran.nextDouble()*2*Math.PI;
        Cartesian wind = forest.getWind();
        speed = new Cartesian(diffusion*Math.cos(theta)+wind.x(), diffusion*Math.sin(theta)+wind.y());
    }

    public int getSource() {
        return source;
    }

    /**
     * Set the value of diffusion
     * @param newVar the new value of diffusion
     */
    public void setDiffusion (double newVar) {
        diffusion = newVar;
    }

    /**
     * Get the value of diffusion
     * @return the value of diffusion
     */
    public double getDiffusion () {
        return diffusion;
    }

    /**
     * Set the value of speed
     * @param newVar the new value of speed
     */
    public void setSpeed (Cartesian newVar) {
        speed = newVar;
    }

    /**
     * Get the value of speed
     * @return the value of speed
     */
    public Cartesian getSpeed () {
        return speed;
    }

    /**
     * Set the value of drawEmber
     * @param newVar the new value of drawEmber
     */
    public void setDrawEmber (ShowEmber newVar) {
        drawEmber = newVar;
    }

    /**
     * Get the value of drawEmber
     * @return the value of drawEmber
     */
    public ShowEmber getDrawEmber () {
        return drawEmber;
    }

    /**
     * Set the value of forest
     * @param newVar the new value of forest
     */
    private void setForest (Forest newVar) {
        forest = newVar;
    }

    /**
     * Get the value of forest
     * @return the value of forest
     */
    private Forest getForest () {
        return forest;
    }

    /**
     * speed got here is different from that in constructor, since theta is random variable
     * this method will not be used at present stage.
     */
    public void calcSpeed() {
        double theta = ran.nextDouble()*2*Math.PI;
        Cartesian wind = forest.getWind();
        speed = new Cartesian(diffusion*Math.cos(theta)+wind.x(), diffusion*Math.sin(theta)+wind.y());
    }


}
