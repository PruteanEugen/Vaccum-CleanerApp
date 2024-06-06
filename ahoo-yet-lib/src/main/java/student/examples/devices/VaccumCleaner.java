package student.examples.devices;

import static student.examples.devices.PowerState.OFF;
import static student.examples.devices.PowerState.ON;

public class VaccumCleaner implements HasPowerOnOff{

    private PowerState powerState;

    public VaccumCleaner() {
        switchOff();

    }

    @Override
    public boolean switchOn() {
        powerState = ON;
        return true;
    }

    @Override
    public boolean switchOff() {
        powerState = OFF;
        return true;
    }

    @Override
    public boolean isOn() {
        return powerState != OFF;
    }
}
