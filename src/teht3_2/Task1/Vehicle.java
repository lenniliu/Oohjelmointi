package teht3_2.Task1;

interface Vehicle {
    void start();
    void stop();
    void getInfo();
}

class Car implements Vehicle {


    @Override
    public void start() {
        System.out.println("Car started");
    }
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
    @Override
    public void getInfo() {
        System.out.println("Type: Car");
        System.out.println("Fuel: Petrol");
        System.out.println("Color: Red");
    }
}

class Motorcycle implements Vehicle {


        @Override
        public void start() {
            System.out.println("Motorcycle started");
        }
        @Override
        public void stop() {
            System.out.println("Motorcycle stopped");
        }
        @Override
        public void getInfo() {
            System.out.println("Type: Motorcycle");
            System.out.println("Fuel: Gasoline");
            System.out.println("Color: Black");
        }
}

class Bus implements Vehicle {


    @Override
    public void start() {
        System.out.println("Bus started");
    }
    @Override
    public void stop() {
        System.out.println("Bus stopped");
    }
    @Override
    public void getInfo() {
        System.out.println("Type: Bus");
        System.out.println("Fuel: Diesel");
        System.out.println("Color: Yellow");
    }
}
