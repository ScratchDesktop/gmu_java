// package excercise_two;

/*
 * Names: Kelton Thope
 * netID: kthorpe5
 * G#: yourGNumber
 * Lecture section: 002
 * Lab section: 004
 */

/**
 * TeeOneThousand is a MovieRobot that cannot speak (no catchphrase)
 * but has the ability to clean.
 */
public class TeeOneThousand extends MovieRobot {
    
    /**
     * Constructs a TeeOneThousand with the given serial number and capabilities.
     * Sets the catchphrase to null.
     *
     * @param serialNumber the unique identifier
     * @param flies if the robot can fly
     * @param autonomous if the robot is autonomous
     * @param teleoperated if the robot is teleoperated
     */
    public TeeOneThousand(int serialNumber, boolean flies, boolean autonomous, boolean teleoperated) {
        super(serialNumber, flies, autonomous, teleoperated, null);
    }
    
    /**
     * TeeOneThousand cannot speak.
     *
     * @return false always
     */
    @Override
    public boolean canSpeak() {
        return false;
    }
    
    /**
     * Indicates that TeeOneThousand can clean.
     *
     * @return true always
     */
    public boolean canClean() {
        return true;
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

