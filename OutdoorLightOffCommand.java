/**
*
* @author Owen Oliveira
*/
public class OutdoorLightOffCommand implements Command {
    OutdoorLight outdoorLight;
    
    public OutdoorLightOffCommand(OutdoorLight outdoorLight) {
        this.outdoorLight = outdoorLight;
    }
    
    public void execute() {
        outdoorLight.off();
    }
}
