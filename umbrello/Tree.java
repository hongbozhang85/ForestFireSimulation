

/**
 * Class Tree
 */
public class Tree extends Item {

  //
  // Fields
  //

  private int states;
  private Show drawTree;
  private int emberPassBy;
  
  //
  // Constructors
  //
  public Tree () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of states
   * @param newVar the new value of states
   */
  private void setStates (int newVar) {
    states = newVar;
  }

  /**
   * Get the value of states
   * @return the value of states
   */
  private int getStates () {
    return states;
  }

  /**
   * Set the value of drawTree
   * @param newVar the new value of drawTree
   */
  private void setDrawTree (Show newVar) {
    drawTree = newVar;
  }

  /**
   * Get the value of drawTree
   * @return the value of drawTree
   */
  private Show getDrawTree () {
    return drawTree;
  }

  /**
   * Set the value of emberPassBy
   * @param newVar the new value of emberPassBy
   */
  private void setEmberPassBy (int newVar) {
    emberPassBy = newVar;
  }

  /**
   * Get the value of emberPassBy
   * @return the value of emberPassBy
   */
  private int getEmberPassBy () {
    return emberPassBy;
  }

  //
  // Other methods
  //

}
