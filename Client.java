/**
 *
 * @author Owen Oliveira
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Create the remote control with 8 slots/buttons (invoker)
    ProgrammableRemoteControl remote = new ProgrammableRemoteControl(8);
 
    // Create receivers for each functionality
    AirCondition airCondition = new AirCondition();
    GarageDoor garageDoor = new GarageDoor();
    LivingRoomLights livingRoomLights = new LivingRoomLights();
    OutdoorLight outdoorLight = new OutdoorLight();
    AllLights allLights = new AllLights(livingRoomLights, outdoorLight); // Assuming you have an AllLights class
    
    // Create commands for each functionality
    Command airConditionCommandOn = new AirConditionOn(airCondition);
    Command airConditionCommandOff = new AirConditionOff(airCondition);
    Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
    Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
    Command livingRoomLightsOnCommand = new LivingRoomLightsOn(livingRoomLights);
    Command livingRoomLightsOffCommand = new LivingRoomLightsOff(livingRoomLights);
    Command outdoorLightOnCommand = new OutdoorLightOnCommand(outdoorLight);
    Command outdoorLightOffCommand = new OutdoorLightOffCommand(outdoorLight);
    Command allLightsOnCommand = new AllLightsOn(allLights);
    Command allLightsOffCommand = new AllLightsOff(allLights);
    
        
    // Assign commands to remote control slots
    remote.setCommand(0, airConditionCommandOn); // Slot 0 for air conditioner on
    remote.setCommand(1, airConditionCommandOff); // Slot 1 for air conditioner off
    remote.setCommand(2, garageDoorOpenCommand); // Slot 2 for garage door open
    remote.setCommand(3, garageDoorCloseCommand); // Slot 3 for garage door close
    remote.setCommand(4, livingRoomLightsOnCommand); // Slot 4 for living room lights on
    remote.setCommand(5, livingRoomLightsOffCommand); // Slot 5 for living room lights off
    remote.setCommand(6, outdoorLightOnCommand); // Slot 6 for outdoor light on
    remote.setCommand(7, outdoorLightOffCommand); // Slot 7 for outdoor light off
    remote.setCommand(8, allLightsOnCommand); // Slot 8 for all lights on
    remote.setCommand(9, allLightsOffCommand); // Slot 9 for all lights off

    }
    
}
