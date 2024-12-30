//Create an abstract class Appliance with methods turnOn() (abstract) and turnOff()
// (non-abstract). Derive a class Fan and implement turnOn()

package Day_3.Abstract;

public abstract class Appliance {
    public abstract void turnon();
    public void turnoff(){
        System.out.println("Turning off");
    }
}
class Fan extends Appliance{
    @Override
    public void turnon() {
        System.out.println("Turning on the fan");
    }
}
class Main5{
    public static void main(String[] args) {

        Fan f = new Fan();
        f.turnoff();
        f.turnon();
    }
}
