/**
 *
 * @author Owen Oliveira
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor door;
    
    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }
    
    public void execute(){
        door.down(); // Assuming "down" method closes the garage door
    }
}
