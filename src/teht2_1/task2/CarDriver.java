package teht2_1.task2;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar;
        myCar = new Car("Lada");
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.acelerate();
            System.out.println(myCar.getTypeName() + ": speed is: " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.brake(10);
            System.out.println(myCar.getTypeName() + ": speed is: " + myCar.getSpeed() + " km/h");
        }
    }
}
