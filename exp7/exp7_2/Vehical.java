
interface Vehicle {
    void start();
    void stop();
    double getFuelLevel();
}

class Car implements Vehicle {
    private double fuelLevel;

    public Car(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
    
    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}

class Motorcycle implements Vehicle {
    private double fuelLevel;

    public Motorcycle(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle has stopped.");
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}

public class Vehical {
    public static void main(String[] args) {
        
        Vehicle myCar = new Car(50);
        myCar.start();
        System.out.println("Car Fuel Level: " + myCar.getFuelLevel() + " liters");
        myCar.stop();

        System.out.println();

    
        Vehicle myMotorcycle = new Motorcycle(10);
        myMotorcycle.start();
        System.out.println("Motorcycle Fuel Level: " + myMotorcycle.getFuelLevel() + " liters");
        myMotorcycle.stop();
    }
}
