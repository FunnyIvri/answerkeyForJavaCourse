package project4.bases;

public class Auto {
    private final Subsystem[] subsystems;
    public final String name;
    public Auto(Subsystem[] subsystems, String name) {
        this.subsystems = subsystems;
        this.name = name;
    }
    public void start(){}
    public void periodic(){}
    public void end(){}
    
}
