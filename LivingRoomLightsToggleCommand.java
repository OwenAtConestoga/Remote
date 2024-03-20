
/**
*
* @author Khoirul Umam
*/
public class LivingRoomLightsToggleCommand implements Command {
    LivingRoomLights livingRoomLights;

    public LivingRoomLightsToggleCommand(LivingRoomLights livingRoomLights) {
        this.livingRoomLights = livingRoomLights;
    }

    public void execute() {
        livingRoomLights.toggle();
    }
}
