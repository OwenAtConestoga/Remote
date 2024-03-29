/**
 *
 * @author Owen Oliveira
 */
public class LivingRoomLights {
    private boolean isOn;

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
    }

    public void on() {
        System.out.println("Living room lights are now on");
        isOn = true;
    }

    public void off() {
        System.out.println("Living room lights are now off");
        isOn = false;
    }
}
