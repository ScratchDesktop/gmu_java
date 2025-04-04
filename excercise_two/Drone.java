// package excercise_two;

/*
 * Names: Kelton Thope
 * netID: kthorpe5
 * G#: yourGNumber
 * Lecture section: 002
 * Lab section: 004
 */

 /**
  * A Drone is a Robot that always flies, is teleoperated, and is not autonomous.
  */
  public class Drone extends Robot {
    
    /**
     * Constructs a Drone with the given serial number.
     *
     * @param serialNumber the unique identifier
     */
    public Drone(int serialNumber) {
        super(serialNumber, true, false, true);
    }
    
    /**
     * Always returns true.
     */
    @Override
    public boolean canFly() {
        return true;
    }
    
    /**
     * Always returns false.
     */
    @Override
    public boolean isAutonomous() {
        return false;
    }
    
    /**
     * Always returns true.
     */
    @Override
    public boolean isTeleoperated() {
        return true;
    }
}

