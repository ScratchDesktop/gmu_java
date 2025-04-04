// package excercise_two;

/*
 * Names: Kelton Thope
 * netID: kthorpe5
 * G#: yourGNumber
 * Lecture section: 002
 * Lab section: 004
 */

/**
 * Base class to represent a generic robot with various capabilities.
 */
public class Robot {
    private final int serialNumber;
    private boolean flies;
    private boolean autonomous;
    private boolean teleoperated;
    
    /**
     * Constructs a Robot with the given serial number and capabilities.
     *
     * @param serialNumber the unique identifier
     * @param flies if the robot can fly
     * @param autonomous if the robot operates autonomously
     * @param teleoperated if the robot is teleoperated
     */
    public Robot(int serialNumber, boolean flies, boolean autonomous, boolean teleoperated) {
        this.serialNumber = serialNumber;
        this.flies = flies;
        this.autonomous = autonomous;
        this.teleoperated = teleoperated;
    }
    
    /**
     * Sets the robot's capabilities.
     *
     * @param flies new flies capability
     * @param autonomous new autonomous capability
     * @param teleoperated new teleoperated capability
     */
    public void setCapabilities(boolean flies, boolean autonomous, boolean teleoperated) {
        this.flies = flies;
        this.autonomous = autonomous;
        this.teleoperated = teleoperated;
    }
    
    /**
     * Returns the robot's serial number.
     *
     * @return the serial number
     */
    public int getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * Indicates if the robot can fly.
     *
     * @return true if it can fly, false otherwise
     */
    public boolean canFly() {
        return flies;
    }
    
    /**
     * Indicates if the robot is autonomous.
     *
     * @return true if autonomous, false otherwise
     */
    public boolean isAutonomous() {
        return autonomous;
    }
    
    /**
     * Indicates if the robot is teleoperated.
     *
     * @return true if teleoperated, false otherwise
     */
    public boolean isTeleoperated() {
        return teleoperated;
    }
    
    /**
     * Returns a string of capabilities separated by spaces.
     *
     * @return a string of capabilities
     */
    public String getCapabilities() {
        StringBuilder caps = new StringBuilder();
        if (canFly()) caps.append("canFly ");
        if (isAutonomous()) caps.append("isAutonomous ");
        if (isTeleoperated()) caps.append("isTeleoperated ");
        // Remove trailing space if present.
        return caps.toString().trim();
    }
    
    /**
     * Returns a string representation of the robot.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ID: " + serialNumber + ", Capabilities: " + getCapabilities();
    }
}
