package student.examples.devices;

import students.examples.com.HasBattery;

import static student.examples.devices.PowerState.OFF;
import static student.examples.devices.PowerState.ON;

public class VaccumCleaner extends Device implements HasPowerStates, HasBattery {
    private final static int MIN_CHARGE = 10;
    private int charge;
    private PowerState powerState;


    public VaccumCleaner() {
        init();
    }
    public VaccumCleaner (int id, String name){
        super(id,name);
        init();

    }
    private void init(){
        switchOff();
        setCharge(0);
    }


    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
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

    @Override
    public boolean charge() {
        setCharge(charge+5);
        return true;

    }

    @Override
    public boolean disCharge() {
        setCharge(charge-5);
        return true;

    }

    @Override
    public boolean isCharged() {
        return charge >= MIN_CHARGE;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n  |"+
                "\n  +"+
                " -"+
                " >"+
                " VaccumCleaner{" +
                "charge=" + charge +
                ", powerState=" + powerState +
                '}';
    }
}
