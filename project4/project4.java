package project4;

import project4.autos.DepotToShoot;
import project4.autos.RBumbReverse;
import project4.bases.Auto;
import project4.bases.Subsystem;
import project4.subsystems.IntakeArm;
import project4.subsystems.Shooter;

public class project4 {
    public static void main(String[] args) {
        Subsystem[] subsystems = {new IntakeArm(),new Shooter()};
        Auto[] autos = {
            new DepotToShoot(subsystems),
            new RBumbReverse(subsystems)
        };
        Robot robot = new Robot(subsystems,autos);
        robot.runAuto(0);
        robot.periodic();
        robot.runAuto(1);
        robot.periodic();
        robot.stopAuto();
    }
}
