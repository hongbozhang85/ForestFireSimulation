

/**
 * Class Ember
 */
public class Ember extends Item {

  //
  // Fields
  //

  private double diffusion;
  private Cartesian speed;
  private ShowEmber drawEmber;
  private Forest forest;
  
  //
  // Constructors
  //
  public Ember () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of diffusion
   * @param newVar the new value of diffusion
   */
  private void setDiffusion (double newVar) {
    diffusion = newVar;
  }

  /**
   * Get the value of diffusion
   * @return the value of diffusion
   */
  private double getDiffusion () {
    return diffusion;
  }

  /**
   * Set the value of speed
   * @param newVar the new value of speed
   */
  private void setSpeed (Cartesian newVar) {
    speed = newVar;
  }

  /**
   * Get the value of speed
   * @return the value of speed
   */
  private Cartesian getSpeed () {
    return speed;
  }

  /**
   * Set the value of drawEmber
   * @param newVar the new value of drawEmber
   */
  private void setDrawEmber (ShowEmber newVar) {
    drawEmber = newVar;
  }

  /**
   * Get the value of drawEmber
   * @return the value of drawEmber
   */
  private ShowEmber getDrawEmber () {
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

  //
  // Other methods
  //

  /**
   * @param        forest
   */
  public void calcSpeed(Forest forest)
  {
  }


}
