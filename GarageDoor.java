/**
 *
 * @author Owen Oliveira
 */
public class GarageDoor {
    private boolean isOpen;

    public void toggle() {
        if (isOpen) {
            close();
        } else {
            open();
        }
    }

    public void open() {
        System.out.println("Garage door is now open");
        isOpen = true;
    }

    public void close() {
        System.out.println("Garage door is now closed");
        isOpen = false;
    }
}
