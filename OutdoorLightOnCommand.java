
/**
*
* @author Owen Oliveira
*/
public class OutdoorLightOnCommand implements Command {
    OutdoorLight outdoorLight;
    
    public OutdoorLightOnCommand(OutdoorLight outdoorLight) {
        this.outdoorLight = outdoorLight;
    }
    
    public void execute() {
        outdoorLight.on();
    }
 }
 