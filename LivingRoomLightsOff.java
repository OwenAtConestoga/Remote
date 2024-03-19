/**
*
* @author Owen Oliveira
*/
public class LivingRoomLightsOff implements Command {
    LivingRoomLights light;
    
    public LivingRoomLightsOff(LivingRoomLights light) {
        this.light = light;
    }
    
    public void execute() {
        light.off();
    }
 }
 