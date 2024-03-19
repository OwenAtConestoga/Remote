/**
 *
 * @author Owen Oliveira
 */
public class AllLightsOn implements Command {
    AllLights allLights;

    public AllLightsOn(AllLights allLights) {
        this.allLights = allLights;
    }

    public void execute() {
        allLights.allOn();
    }
}
