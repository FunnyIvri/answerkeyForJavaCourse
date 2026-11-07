package project4.autos;

import project4.bases.Auto;
import project4.bases.Subsystem;

public class DepotToShoot extends Auto {

    public DepotToShoot(Subsystem[] subsystems) {
        super(subsystems, "Depot to Shoot");
    }
    @Override
    public void start(){
        System.out.println("Started moving to depot");
    } 
    @Override
    public void periodic(){
        System.out.println("Weee lets go to the depot");
    }
    @Override
    public void end(){
        System.out.println("lets go shoot from depot");
    }
    
}
