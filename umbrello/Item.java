

/**
 * Class Item
 */
public class Item {

  //
  // Fields
  //

  private Cartesian position;
  private double radius;
  
  //
  // Constructors
  //
  public Item () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of position
   * @param newVar the new value of position
   */
  private void setPosition (Cartesian newVar) {
    position = newVar;
  }

  /**
   * Get the value of position
   * @return the value of position
   */
  private Cartesian getPosition () {
    return position;
  }

  /**
   * Set the value of radius
   * @param newVar the new value of radius
   */
  private void setRadius (double newVar) {
    radius = newVar;
  }

  /**
   * Get the value of radius
   * @return the value of radius
   */
  private double getRadius () {
    return radius;
  }

  //
  // Other methods
  //

  /**
   * @return       Cartesian
   */
  public Cartesian getPosition()
  {
  }


}
