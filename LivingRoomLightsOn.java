
/**
*
* @author Khoirul Umam
*/
public class LivingRoomLightsOn implements Command {
   LivingRoomLights light;
   
   public LivingRoomLightsOn(LivingRoomLights light) {
       this.light = light;
   }
   
   public void execute() {
       light.on();
   }
}
