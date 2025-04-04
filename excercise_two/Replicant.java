// package excercise_two;

/*
 * Names: Kelton Thope
 * netID: kthorpe5
 * G#: yourGNumber
 * Lecture section: 002
 * Lab section: 004
 */

/**
 * Replicant is a MovieRobot with the catchphrase "like tears in rain..."
 * and the additional capability to fight.
 */
public class Replicant extends MovieRobot {
    
    /**
     * Constructs a Replicant with the given parameters.
     *
     * @param serialNumber the unique identifier
     * @param flies if the robot can fly
     * @param autonomous if the robot is autonomous
     * @param teleoperated if the robot is teleoperated
     */
    public Replicant(int serialNumber, boolean flies, boolean autonomous, boolean teleoperated) {
        super(serialNumber, flies, autonomous, teleoperated, "like tears in rain...");
    }
    
    /**
     * Replicant can speak if it has a catchphrase.
     *
     * @return true if catchphrase is not null
     */
    @Override
    public boolean canSpeak() {
        return catchphrase != null;
    }
    
    /**
     * Indicates that Replicant can fight.
     *
     * @return true always
     */
    public boolean canFight() {
        return true;
    }
    
    /**
     * Returns capabilities including fight.
     *
     * @return the capabilities string
     */
    @Override
    public String getCapabilities() {
        String baseCaps = super.getCapabilities();
        if (!baseCaps.isEmpty()) {
            return baseCaps + " fight";
        }
        return "fight";
    }
}

