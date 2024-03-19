

/**
 *
 * @author Khoirul Umam
 */
public class ProgrammableRemoteControl {
    Command slot;
    
    public void setCommand(Command command) {
        slot = command;
    }
    
    public void buttonWasPressed() {
        slot.execute();
    }
}
