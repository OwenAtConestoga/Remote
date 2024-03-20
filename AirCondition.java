/**
 *
 * @author Owen Oliveira
 */
public class AirCondition {
    private boolean isOn;

    public void toggle() {
        if (isOn) {
            turnOff();
        } else {
            turnOn();
        }
    }

    public void turnOn() {
        System.out.println("Air conditioner is now on");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Air conditioner is now off");
        isOn = false;
    }
}
