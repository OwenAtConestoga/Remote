/**
 *
 * @author Owen Oliveira
 */
public class GarageDoorToggleCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorToggleCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.toggle();
    }
}
