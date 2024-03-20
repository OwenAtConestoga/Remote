/**
 *
 * @author Owen Oliveira
 */
public class AirConditionToggleCommand implements Command {
    AirCondition airCondition;

    public AirConditionToggleCommand(AirCondition airCondition) {
        this.airCondition = airCondition;
    }

    public void execute() {
        airCondition.toggle();
    }
}
