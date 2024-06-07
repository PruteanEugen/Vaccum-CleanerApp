package student.examples;

import junit.framework.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.examples.devices.HasPowerStates;
import student.examples.devices.VaccumCleaner;
import students.examples.com.HasBattery;

public class HasPowerStateTest {
    private HasPowerStates hasPowerStates;


    @BeforeEach
    public void setup(){
        hasPowerStates = new VaccumCleaner(1,"Atom");
    }



    @Test
    public void testSwitchON() {
            // Turn the device on
            hasPowerStates.switchOn();
            // Verify that the device is on
        Assert.assertTrue(hasPowerStates.isOn());
        }
    @Test
    public void testSwitchOFF() {
        hasPowerStates.switchOff();
        Assert.assertFalse(hasPowerStates.isOn());
        }
    }


