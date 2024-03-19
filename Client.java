/**
 *
 * @author Owen Oliveira
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /** INVOKER **/
        ProgrammableRemoteControl remote  = new ProgrammableRemoteControl();
        
        /** RECEIVER **/
        AirCondition airCondition = new AirCondition();
        GarageDoor garageDoor              = new GarageDoor();
        LivingRoomLights livingRoomLights  = new LivingRoomLights();
        OutdoorLight outdoorLight          = new OutdoorLight(); 
        
        /** COMMAND **/
        AirConditionOn airConditionOn = new AirConditionOn(airConditionOn);
        LivingRoomLights lightOn          = new LivingRoomLightsOn(light);
        OutdoorLightsOnCommand
        GarageDoorOpenCommand doorOpen  = new GarageDoorOpenCommand(garageDoor);
        TelevisionPlayCommand tvPlay    = new TelevisionPlayCommand(tv);
        
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
        remote.setCommand(tvPlay);
        remote.buttonWasPressed();
    }
    
}
