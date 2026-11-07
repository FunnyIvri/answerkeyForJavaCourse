package project4.subsystems;

import project4.bases.Motor;
import project4.bases.Subsystem;
import project4.motors.Falcon500;

public class IntakeArm extends Subsystem {

    public IntakeArm() {
        super(new Motor[] { new Falcon500(21) }, "IntakeArm");
    }
    public void intake(){
        motorsArray[0].runAtSetVoltage(12);
    }
}
