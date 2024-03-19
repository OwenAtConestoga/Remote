/**
 *
 * @author Owen Oliveira
 */
public class AirConditionOn implements Command {
    AirCondition fan;
    
    public AirConditionOn(AirCondition fan) {
        this.fan = fan;
    }
    
    public void execute(){
        fan.on();
    }
}
