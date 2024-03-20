/**
 *
 * @author Owen Oliveira
 */
public class ResetAllDevicesCommand implements Command {
    private AirCondition airCondition;
    private GarageDoor garageDoor;
    private LivingRoomLights livingRoomLights;
    private OutdoorLight outdoorLight;
    private AllLights allLights;

    public ResetAllDevicesCommand(AirCondition airCondition, GarageDoor garageDoor, LivingRoomLights livingRoomLights, OutdoorLight outdoorLight, AllLights allLights) {
        this.airCondition = airCondition;
        this.garageDoor = garageDoor;
        this.livingRoomLights = livingRoomLights;
        this.outdoorLight = outdoorLight;
        this.allLights = allLights;
    }

    public void execute() {
        // Reset all devices to their initial state
        airCondition.turnOff();
        garageDoor.close();
        livingRoomLights.off();
        outdoorLight.off();
        allLights.allOff();
    }
}
