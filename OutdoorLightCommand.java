/**
*
* @author Owen Oliveira
*/
public class OutdoorLight {
    private boolean isOn;

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
    }

    public void on() {
        System.out.println("Outdoor light is now on");
        isOn = true;
    }

    public void off() {
        System.out.println("Outdoor light is now off");
        isOn = false;
    }
}
