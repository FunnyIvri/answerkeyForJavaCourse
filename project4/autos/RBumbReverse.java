package project4.autos;

import project4.bases.Auto;
import project4.bases.Subsystem;

public class RBumbReverse extends Auto {

    public RBumbReverse(Subsystem[] subsystems) {
        super(subsystems, "RBump reverse");
    }
    @Override
    public void start(){
        System.out.println("Started reversing from right bump ");
    } 
    @Override
    public void periodic(){
        System.out.println("Weee lets get ready to shoot");
    }
    @Override
    public void end(){
        System.out.println("lets go shooting now");
    }
    
}
