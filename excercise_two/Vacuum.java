// package excercise_two;

/*
 * Names: Kelton Thope
 * netID: kthorpe5
 * G#: yourGNumber
 * Lecture section: 002
 * Lab section: 004
 */

/**
 * A Vacuum is a Robot that is autonomous, cannot fly or be teleoperated,
 * and has the additional capability to clean.
 */
public class Vacuum extends Robot {
    
    /**
     * Constructs a Vacuum with the given serial number.
     *
     * @param serialNumber the unique identifier
     */
    public Vacuum(int serialNumber) {
        super(serialNumber, false, true, false);
    }
    
    /**
     * Indicates that the vacuum can clean.
     *
     * @return true always
     */
    public boolean canClean() {
        return true;
    }
    
    /**
     * Always returns false.
     */
    @Override
    public boolean canFly() {
        return false;
    }
    
    /**
     * Always returns true.
     */
    @Override
    public boolean isAutonomous() {
        return true;
    }
    
    /**
     * Always returns false.
     */
    @Override
    public boolean isTeleoperated() {
        return false;
    }
    
    /**
     * Returns capabilities including cleaning.
     *
     * @return the capabilities string
     */
    @Override
    public String getCapabilities() {
        String baseCaps = super.getCapabilities();
        if (!baseCaps.isEmpty()) {
            return baseCaps + " canClean";
        }
        return "canClean";
    }
}

