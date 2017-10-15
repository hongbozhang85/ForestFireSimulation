/**
 * Created by hongbo on 17-2-22.
 */
public class Cartesian {

    private double x;
    private double y;

    Cartesian(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Set the value of x
     * @param newVar the new value of x
     */
    private void setX (double newVar) {
        x = newVar;
    }

    /**
     * Get the value of x
     * @return the value of x
     */
    public double x() {
        return x;
    }

    /**
     * Set the value of y
     * @param newVar the new value of y
     */
    private void setY (double newVar) {
        y = newVar;
    }

    /**
     * Get the value of y
     * @return the value of y
     */
    public double y() {
        return y;
    }

    /**
     * @param        x
     * @param        y
     */
    public void set(double x, double y) {
        setX(x);
        setY(y);
    }

    /**
     * @param        deltaX
     * @param        deltaY
     */
    public void add(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public static double distance(Cartesian c1, Cartesian c2) {
        double x1 = c1.x();
        double y1 = c1.y();
        double x2 = c2.x();
        double y2 = c2.y();
        return Math.sqrt( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) );
    }

}
