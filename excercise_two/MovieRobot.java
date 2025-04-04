// package excercise_two;

/*
 * Names: Kelton Thope
 * netID: kthorpe5
 * G#: yourGNumber
 * Lecture section: 002
 * Lab section: 004
 */

/**
 * Abstract class for MovieRobots which extend Robot and introduce speech.
 */
public abstract class MovieRobot extends Robot {
    protected String catchphrase;
    
    /**
     * Constructs a MovieRobot with the given parameters.
     *
     * @param serialNumber the unique identifier
     * @param flies if the robot can fly
     * @param autonomous if the robot is autonomous
     * @param teleoperated if the robot is teleoperated
     * @param catchphrase the catchphrase of the robot
     */
    public MovieRobot(int serialNumber, boolean flies, boolean autonomous, boolean teleoperated, String catchphrase) {
        super(serialNumber, flies, autonomous, teleoperated);
        this.catchphrase = catchphrase;
    }
    
    /**
     * Overloaded constructor with no catchphrase.
     *
     * @param serialNumber the unique identifier
     * @param flies if the robot can fly
     * @param autonomous if the robot is autonomous
     * @param teleoperated if the robot is teleoperated
     */
    public MovieRobot(int serialNumber, boolean flies, boolean autonomous, boolean teleoperated) {
        this(serialNumber, flies, autonomous, teleoperated, null);
    }
    
    /**
     * Abstract method to indicate if the robot can speak.
     *
     * @return true if it can speak, false otherwise
     */
    public abstract boolean canSpeak();
    
    /**
     * Returns the capabilities including canSpeak if applicable.
     *
     * @return the capabilities string
     */
    @Override
    public String getCapabilities() {
        String baseCaps = super.getCapabilities();
        if (canSpeak()) {
            if (!baseCaps.isEmpty()) {
                return baseCaps + " canSpeak";
            }
            return "canSpeak";
        }
        return baseCaps;
    }
    
    /**
     * Returns a string representation of the MovieRobot.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        String baseString = super.toString();
        if (canSpeak()) {
            return baseString + " \"" + catchphrase + "\"";
        }
        return baseString;
    }
}

