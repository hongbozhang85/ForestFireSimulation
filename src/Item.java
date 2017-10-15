/**
 * Created by hongbo on 17-2-22.
 */
public class Item {

    protected Cartesian position;
    protected double radius;

    Item(double x, double y) {
        position = new Cartesian(x,y);
    }

    /**
     * Set the value of position
     * @param newVar the new value of position
     */
    public void setPosition(Cartesian newVar) {
        position = newVar;
    }

    public void setPosition(double x, double y) {
        position.set(x,y);
    }
    /**
     * Get the value of position
     * @return the value of position
     */
    public Cartesian getPosition() {
        return position;
    }

    /**
     * Set the value of radius
     * @param newVar the new value of radius
     */
    public void setRadius(double newVar) {
        radius = newVar;
    }

    /**
     * Get the value of radius
     * @return the value of radius
     */
    public double getRadius() {
        return radius;
    }

}
