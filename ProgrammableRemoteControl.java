

/**
 *
 * @author Owen Oliveira
 */
public class ProgrammableRemoteControl {
    Command[] slots;

    public ProgrammableRemoteControl(int numberOfSlots) {
        slots = new Command[numberOfSlots];
    }

    public void setCommand(int buttonNumber, Command command) {
        slots[buttonNumber] = command;
    }

    public void buttonWasPressed(int buttonNumber) {
        if (buttonNumber >= 0 && buttonNumber < slots.length && slots[buttonNumber] != null) {
            slots[buttonNumber].execute();
        } else {
            System.out.println("No command assigned to button " + buttonNumber);
        }
    }
}
