// package excercise_two;

/*
 * Names: Kelton Thope
 * netID: kthorpe5
 * G#: yourGNumber
 * Lecture section: 002
 * Lab section: 004
 */

/**
 * HAL9000 is a MovieRobot that flies and always speaks.
 * Its catchphrase is fixed as "I can't let you do that Dave."
 */
public class HAL9000 extends MovieRobot {
    
    /**
     * Constructs a HAL9000 with the given serial number.
     * Assumes autonomous and teleoperated values are provided.
     *
     * @param serialNumber the unique identifier
     * @param autonomous if the robot is autonomous
     * @param teleoperated if the robot is teleoperated
     */
    public HAL9000(int serialNumber, boolean autonomous, boolean teleoperated) {
        super(serialNumber, true, autonomous, teleoperated, "I can't let you do that Dave.");
    }
    
    /**
     * HAL9000 can speak if it has a catchphrase.
     *
     * @return true if catchphrase is not null
     */
    @Override
    public boolean canSpeak() {
        return catchphrase != null;
    }
}

