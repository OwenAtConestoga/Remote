/**
 *
 * @author Owen Oliveira
 */
public class AllLightsToggleCommand implements Command {
    AllLights allLights;

    public AllLightsToggleCommand(AllLights allLights) {
        this.allLights = allLights;
    }

    public void execute() {
        allLights.toggle();
    }
}
