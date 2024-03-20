/**
 *
 * @author Owen Oliveira
 */
public class AllLights {
    private LivingRoomLights livingRoomLights;
    private OutdoorLight outdoorLight;
    private boolean allLightsOn;

    public AllLights(LivingRoomLights livingRoomLights, OutdoorLight outdoorLight) {
        this.livingRoomLights = livingRoomLights;
        this.outdoorLight = outdoorLight;
    }

    public void toggle() {
        if (allLightsOn) {
            allOff();
        } else {
            allOn();
        }
    }

    public void allOn() {
        livingRoomLights.on();
        outdoorLight.on();
        allLightsOn = true;
    }

    public void allOff() {
        livingRoomLights.off();
        outdoorLight.off();
        allLightsOn = false;
    }
}
