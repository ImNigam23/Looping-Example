package world.swarnimvihar;

import world.swarnimvihar.madhuban.MadhubanGate;

public class SwarnimViharGate {

    public void entry(){
        System.out.println("I am inside Swarnim vihar");
        MadhubanEntry gate = new MadhubanEntry();
        gate.enter();
    }
}
