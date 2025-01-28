package teht2_1.task2;

public class Car {

    private double speed;
    private double topSpeed;
    private double gasolineLevel;
    private double gasolineTankCapacity;
    private String typeName;

    public Car(String typeName) {
        this(typeName, 100, 200);
    }

    public Car(String typeName, double gasolineTankCapacity, double topSpeed) {
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.topSpeed = topSpeed;
        gasolineLevel = 0;
        speed = 0;
    }

    public void acelerate() {
        if (gasolineLevel > 0) {
            speed = Math.min(topSpeed, speed + 10);
        } else
            speed = 0;
        }

    public void brake(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
            } else
                speed = 0;
        }
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }
}


