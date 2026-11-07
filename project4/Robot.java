package project4;

import project4.bases.Auto;
import project4.bases.Subsystem;

public class Robot {
    private final Subsystem[] subsystems;
    private final Auto[] autosArray;
    private Auto curAuto = null;

    public Robot(Subsystem[] subsystems, Auto[] autosArray) {
        this.subsystems = subsystems;
        this.autosArray = autosArray;
    }

    public void runAuto(int i) {
        if (curAuto != null) {
            curAuto.end();
        }
        curAuto = autosArray[i];
        curAuto.start();
    }

    public void periodic() {
        if (curAuto != null) {
            curAuto.periodic();
        }
    }
    public void stopAuto(){
        curAuto = null;
    }

}
