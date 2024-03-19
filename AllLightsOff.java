/**
 *
 * @author Owen Oliveira
 */
public class AllLightsOff implements Command {
    AllLights allLights;

    public AllLightsOff(AllLights allLights) {
        this.allLights = allLights;
    }

    public void execute() {
        allLights.allOff();
    }
}
