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
    ResetAllDevicesCommand resetAllDevicesCommand = new ResetAllDevicesCommand(airCondition, garageDoor, livingRoomLights, outdoorLight, allLights);

    // Create toggle commands for each functionality
    Command airConditionToggleCommand = new AirConditionToggleCommand(airCondition);
    Command garageDoorToggleCommand = new GarageDoorToggleCommand(garageDoor);
    Command livingRoomLightsToggleCommand = new LivingRoomLightsToggleCommand(livingRoomLights);
    Command outdoorLightToggleCommand = new OutdoorLightToggleCommand(outdoorLight);
    Command allLightsToggleCommand = new AllLightsToggleCommand(allLights);

    // Assign toggle commands to remote control slots
    remote.setCommand(1, airConditionToggleCommand); // Slot 0 for air conditioner toggle
    remote.setCommand(2, garageDoorToggleCommand); // Slot 1 for garage door toggle
    remote.setCommand(3, livingRoomLightsToggleCommand); // Slot 2 for living room lights toggle
    remote.setCommand(4, outdoorLightToggleCommand); // Slot 3 for outdoor light toggle
    remote.setCommand(5, allLightsToggleCommand); // Slot 4 for all lights toggle
    remote.setCommand(8, ResetAllDevicesCommand) // Slot 8 for reset all devices

    // Simulate a button press to toggle each functionality
    remote.buttonWasPressed(1); // Press button 0 to toggle air conditioner
    remote.buttonWasPressed(2); // Press button 1 to toggle garage door
    remote.buttonWasPressed(3); // Press button 2 to toggle living room lights
    remote.buttonWasPressed(4); // Press button 3 to toggle outdoor light
    remote.buttonWasPressed(5); // Press button 4 to toggle all lights
    remote.button
    }
    
}
