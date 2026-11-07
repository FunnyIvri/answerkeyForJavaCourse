package project4.subsystems;

import project4.bases.Motor;
import project4.bases.Subsystem;
import project4.motors.KrakenX60;

public class Shooter extends Subsystem{
    public Shooter() {
        super(new Motor[] { new KrakenX60(30),new KrakenX60(31) }, "IntakeArm");
    }
    public void shoot(){
        for (Motor motor : motorsArray) {
            motor.runAtSetVoltage(12);
        }
    }
}
