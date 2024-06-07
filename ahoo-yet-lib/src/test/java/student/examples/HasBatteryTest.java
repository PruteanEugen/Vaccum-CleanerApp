package student.examples;

import junit.framework.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.examples.devices.VaccumCleaner;
import students.examples.com.HasBattery;

public class HasBatteryTest {

    private  HasBattery hasBattery;

    @BeforeEach
    public void setup(){
        hasBattery = new VaccumCleaner(1,"Atom");
        hasBattery.setCharge(50);
    }
    @Test
    public void testOverCharge(){

        final int TARGET_CHARGE = 100;

        int chargeBefore = hasBattery.getCharge();
        hasBattery.charge();
        int chargeAfter = hasBattery.getCharge();
        int deltaCharge = chargeAfter - chargeBefore;
        int steps = (TARGET_CHARGE - chargeAfter) /deltaCharge;
        steps++;

        while (steps-- != 0){
            hasBattery.charge();
        }
        Assert.assertEquals(100,hasBattery.getCharge());
    }
    @Test
    public void underDischarge(){
        final int MINIMAL_TARGET = 0;

        int dischargeBefore = hasBattery.getCharge();
        hasBattery.disCharge();
        int dischargeAfter = hasBattery.getCharge();
        int deltaDischarge = dischargeBefore - dischargeAfter;
        int steps = (MINIMAL_TARGET + dischargeAfter)/ deltaDischarge;
        steps++;

        while (steps-- != 0){
            hasBattery.disCharge();
        }
        Assert.assertEquals(0,hasBattery.getCharge());
}
}

