package teht3_2.Task1;

public class VehicleDemo {
    public static void main(String args[]) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();

        car.start();
        car.stop();
        car.getInfo();
        System.out.println("");
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        System.out.println("");
        bus.start();
        bus.stop();
        bus.getInfo();
    }
}
