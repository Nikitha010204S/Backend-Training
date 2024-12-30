//Define an interface Vehicle with a method start(). Derive two interfaces FourWheeler
// and TwoWheeler from it, each adding its specific methods. Implement these in relevant classes.

package Day_3.Interface_2;

interface Vehicle {
    void start();
}
interface FourWheeler extends Vehicle {
    void turnOnAc();

}
interface TwoWheeler extends Vehicle {

    void WearHelmet();
}

class Car implements FourWheeler {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void turnOnAc()
    {
        System.out.println("AC is turning on...");
    }
}

class Bike implements TwoWheeler {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
    @Override
    public void WearHelmet() {
        System.out.println("Please wear helmet...");
    }
}
class Main8{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.turnOnAc();
        Bike bike = new Bike();
        bike.start();
        bike.WearHelmet();

    }
}
